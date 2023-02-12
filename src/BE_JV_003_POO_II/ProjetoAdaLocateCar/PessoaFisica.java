package BE_JV_003_POO_II.ProjetoAdaLocateCar;

import java.util.List;

public class PessoaFisica implements Cliente {
    private String cpf;
    private String nomePF;
    private List<Cliente> listaClientes;

    public PessoaFisica(List<Cliente> listaClientes, String nomePF, String cpf) {
        if (clienteExiste(listaClientes, cpf)) {
            throw new RuntimeException();
        }
        this.nomePF = nomePF;
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return this.nomePF;
    }

    @Override
    public String getID() {
        return this.cpf;
    }


    @Override
    public void editar(List<Cliente> listaClientes, String novoNome, String novoCpf) {
        if (clienteExiste(listaClientes, cpf)) {
            throw new RuntimeException();
        }
        this.nomePF = novoNome;
        this.cpf = novoCpf;
    }

    @Override
    public boolean clienteExiste(List<Cliente> listaClientes, String ID) {
        if (!listaClientes.isEmpty()) {
            for (Cliente cliente : listaClientes) {
                if (cliente.getID() == cpf) {
                    System.err.println("Este cliente já possui cadastrado!");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisica{" +
                ", nomePF='" + nomePF + '\'' +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
