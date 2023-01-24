package BE_JV_002_POO_I.Exercicio_20_01_23;

import BE_JV_002_POO_I.Exercicio_20_01_23.Pessoa.Funcionario;
import BE_JV_002_POO_I.Exercicio_20_01_23.Pessoa.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Guilherme","132asd465asd4");
        Loja loja  = new Loja(gerente);
        Computador computadorX = new Computador("Computador X",3000.0,"52YYZ","Dlet","I9", "8GB");
        Computador computadorY = new Computador("Computador Y",1000.0,"123YZ","Dlet","I3", "4GB");
        Funcionario funcionario = new Funcionario("Igor", "8a46s13asd");
        loja.adicionarFuncionario(funcionario);
        loja.adicionarProduto(computadorY);
        loja.adicionarProduto(computadorX);
        System.out.println("\n- - - Vendas do funcionario - - - ");
        funcionario.vender(computadorY);
        funcionario.vender(computadorX);
        System.out.println("\n- - - Vendas do gerente - - - ");
        loja.getGerente().vender(computadorY);
        loja.getGerente().vender(computadorX);



    }
}
