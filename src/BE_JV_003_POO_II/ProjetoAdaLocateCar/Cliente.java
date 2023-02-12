package BE_JV_003_POO_II.ProjetoAdaLocateCar;

import java.util.List;

public interface Cliente {

    public String getNome();

    public String getID();

    public void editar(List<Cliente> clientes, String novoNome, String novoID);

    boolean clienteExiste(List<Cliente> clientes, String ID);
}
