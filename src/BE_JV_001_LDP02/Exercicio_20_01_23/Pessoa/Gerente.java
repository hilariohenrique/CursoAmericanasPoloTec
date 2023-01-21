package BE_JV_001_LDP02.Exercicio_20_01_23.Pessoa;

import BE_JV_001_LDP02.Exercicio_20_01_23.Produto;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }
    public Gerente() {
        super();
    }
    @Override
    public void vender(Produto produto){
        System.out.println("O desconto é de R$ "+produto.getPreco()*0.2);
        calcularComissao(produto);
    }
    @Override
    protected void calcularComissao(Produto produto){
        setValorComissao(getValorComissao()+produto.getPreco()*0.1);
        System.out.println("A comissão da venda é de R$ "+produto.getPreco()*0.1);
        System.out.println("A comissão total é de R$ "+getValorComissao());

    }
}


