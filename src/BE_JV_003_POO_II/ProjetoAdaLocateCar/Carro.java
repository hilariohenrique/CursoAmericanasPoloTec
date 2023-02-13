package BE_JV_003_POO_II.ProjetoAdaLocateCar;

import java.util.List;

public class Carro implements Veiculo {
    private String placa;
    private String nome;
    private TipoVeiculo tipo;
    private boolean alugado;

    private List<Veiculo> listaVeiculos;

    public Carro(List<Veiculo> listaVeiculos, String placa, String nome, TipoVeiculo tipo) {
        if (carroExiste(listaVeiculos, placa)) {
            throw new RuntimeException("O veículo de placa " + placa + " já foi cadastrado, favor cadastrar outro veículo");
        }
        this.placa = placa;
        this.nome = nome;
        this.tipo = tipo;
        this.alugado = false;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }


    public TipoVeiculo getTipo() {
        return this.tipo;
    }

    @Override
    public void setTipo(TipoVeiculo tipoVeiculo) {
        this.tipo = tipoVeiculo;
    }

    private boolean carroExiste(List<Veiculo> listaVeiculos, String placa) {
        if (!listaVeiculos.isEmpty()) {
            for (Veiculo veiculo : listaVeiculos) {
                if (veiculo.getPlaca() == placa) {
                    return true;
                }
            }
        }
        return false;
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

    @Override
    public void setAlugado() {

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

