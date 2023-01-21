package BE_JV_001_LDP02.Exercicio_20_01_23;

import BE_JV_001_LDP02.Exercicio_20_01_23.Pessoa.Funcionario;
import BE_JV_001_LDP02.Exercicio_20_01_23.Pessoa.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;
    private List<Funcionario> funcionarios;

    private Gerente gerente;


    public Loja(List<Produto> produtos) {
        this.produtos = produtos;
        this.funcionarios = new ArrayList<Funcionario>();
        this.gerente = new Gerente();



    }public Loja(Gerente gerente) {
        this.produtos = new ArrayList<Produto>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.gerente = gerente;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
    public void listarProdutos(){
        System.out.println("Lista de produtos");
        for(int index = 0; index < this.produtos.size();index++){
            Computador computador = (Computador) produtos.get(index);
            System.out.println(computador.getNome()+" - R$ "+computador.getPreco());
        }
    }

    public Gerente getGerente() {
        return gerente;
    }
}
