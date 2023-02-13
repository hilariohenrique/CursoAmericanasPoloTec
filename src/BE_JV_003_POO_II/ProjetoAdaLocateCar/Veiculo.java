package BE_JV_003_POO_II.ProjetoAdaLocateCar;

public interface Veiculo {
    String getPlaca();
    void setPlaca(String placa);

    String getNome();
    void setNome(String nome);

    TipoVeiculo getTipo();
    void setTipo(TipoVeiculo tipoVeiculo);

    boolean isAlugado();

    void setAlugado(boolean alugado);

    double getValorDiaria();
}
