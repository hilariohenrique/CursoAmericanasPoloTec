package BE_JV_003_POO_II.ProjetoAdaLocateCar;

import java.util.List;

public class Carro implements Veiculo {
    private final String placa;
    private final String nome;
    private final TipoVeiculo tipo;
    private boolean alugado;

    private List<Veiculo> listaVeiculos;

    public Carro(List<Veiculo> listaVeiculos, String placa, String nome, TipoVeiculo tipo) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca() == placa) {
                throw new RuntimeException("O veículo de placa " + placa + " já foi cadastrado, favor cadastrar outro veículo");
            }
        }
        this.placa = placa;
        this.nome = nome;
        this.tipo = tipo;
        this.alugado = false;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void editar() {

    }

    public TipoVeiculo getTipo() {
        return this.tipo;
    }

    @Override
    public double getValorDiaria() {
        if (this.tipo == TipoVeiculo.PEQUENO) {
            return 100d;
        }
        if (this.tipo == TipoVeiculo.MEDIO) {
            return 150d;
        }
        return 200d;

    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", alugado=" + alugado +
                '}';
    }
}

