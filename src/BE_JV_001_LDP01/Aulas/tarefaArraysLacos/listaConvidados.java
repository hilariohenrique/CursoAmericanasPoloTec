package BE_JV_001_LDP01.Aulas.tarefaArraysLacos;

import java.util.Scanner;

public class listaConvidados {
    public static void main(String[] args) {
        listarConvidados();
    }
    private static void listarConvidados() {
        Scanner scanner = new Scanner(System.in);
        String [] listaNomes = new String[5];
        for(int index = 0; index < listaNomes.length; index++){
            System.out.printf("Informe o %dº nome da lista: ",index+1);
            listaNomes[index] = scanner.nextLine();
        }
        String maiorNome = "";
        for(String nome : listaNomes){
            if(nome.length() > maiorNome.length()){
                maiorNome = nome;
            }
        }
        System.out.println("O maior nome é: "+maiorNome);
    }
}
