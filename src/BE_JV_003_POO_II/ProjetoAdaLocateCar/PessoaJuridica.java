package BE_JV_003_POO_II.ProjetoAdaLocateCar;

import java.util.List;

public class PessoaJuridica implements Cliente {
    private String nomePJ;
    private String cnpj;


    public PessoaJuridica(List<Cliente> listaClientes, String nomePJ, String cnpj) {
        if (clienteExiste(listaClientes,cnpj)){
            throw new RuntimeException();
        }
        this.nomePJ = nomePJ;
        this.cnpj = cnpj;

    }

    @Override
    public void editar(List<Cliente> listaClientes, String novoNome, String novoCnpj) {
        if (clienteExiste(listaClientes,cnpj)){
            throw new RuntimeException();
        }
        this.nomePJ = novoNome;
        this.cnpj = novoCnpj;
    }

    @Override
    public boolean clienteExiste(List<Cliente> listaClientes, String ID) {
        if (!listaClientes.isEmpty()) {
            for (Cliente cliente: listaClientes){
                if (cliente.getID() == cnpj){
                    System.err.println("Este cliente já possui cadastrado!");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getNome() {
        return this.nomePJ;
    }

    @Override
    public String getID() {
        return this.cnpj;
    }


    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "nomePJ='" + nomePJ + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
