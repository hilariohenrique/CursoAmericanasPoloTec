package BE_JV_003_POO_II.ProjetoAdaLocateCar;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aluguel {
    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime dataAluguel;
    private LocalDateTime dataDevolucao;

    public Aluguel(Veiculo veiculo, Cliente cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao) {
        if (veiculo.isAlugado()) {
            throw new RuntimeException("O Veiculo em questão ja está alugado;");
        }
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        veiculo.setAlugado(true);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataAluguel() {
        return dataAluguel;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void devolverVeiculo(Veiculo veiculo, LocalDateTime dataDevolucao) {
        veiculo.setAlugado(false);
        this.dataDevolucao = dataDevolucao;
    }

    public double calcularValorDiarias() {
        return veiculo.getValorDiaria() * calcularDias();
    }

    public Double calcularDias() {
        Double dias = Math.ceil(Double.valueOf(ChronoUnit.SECONDS.between(dataAluguel, dataDevolucao)/86400d));
        return dias;
    }

    public double calcularDesconto() {
        if (this.cliente instanceof PessoaFisica) {
            if (calcularDias() > 5) {
                return calcularValorDiarias() * 0.05d;
            }
        } else if (this.cliente instanceof PessoaJuridica) {
            if (calcularDias() > 3) {
                return calcularValorDiarias() * 0.1d;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "veiculo=" + veiculo +
                ", cliente=" + cliente +
                ", dataAluguel=" + dataAluguel +
                ", dataDevolucao=" + dataDevolucao +
                ", valorAluguel=" + calcularValorDiarias() +
                ", valorDesconto=" + calcularDesconto() +
                '}';
    }
}

