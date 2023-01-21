package BE_JV_001_LDP02.Exercicio_20_02_23.Pessoa;

import BE_JV_001_LDP02.Exercicio_20_02_23.Produto;

public class Funcionario {
    private String nome;
    private String cpf;

    private Double valorComissao;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorComissao=0.0;
    }
    public Funcionario() {
    }

    protected Double getValorComissao() {
        return valorComissao;
    }

    protected void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }
    public void vender(Produto produto){
        System.out.println("O desconto é de R$ "+produto.getPreco()*0.1);
        calcularComissao(produto);

    }
    protected void calcularComissao(Produto produto){
        this.valorComissao+=produto.getPreco()*0.2;
        System.out.println("A comissão da venda é de R$ "+produto.getPreco()*0.2);
        System.out.println("A comissão total é de R$ "+this.valorComissao);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
