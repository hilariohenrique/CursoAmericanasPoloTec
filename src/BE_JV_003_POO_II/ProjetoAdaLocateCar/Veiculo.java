package BE_JV_003_POO_II.ProjetoAdaLocateCar;

public interface Veiculo {
    String getPlaca();

    String getNome();

    void editar();

    TipoVeiculo getTipo();

    boolean isAlugado();

    void setAlugado(boolean alugado);

    double getValorDiaria();
}
