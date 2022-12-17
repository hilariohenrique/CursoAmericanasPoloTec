package BE_JV_001_LDP01.Aulas.tarefaArraysLacos;
import java.util.Scanner;

public class pessoasIdades {
    public static void main(String[] args) {
        nomesIdades();
    }
    private static void nomesIdades() {
        Scanner scanner = new Scanner(System.in);
        Pessoas[] pessoas = new Pessoas[5];
        for(int index = 0; index< pessoas.length; index++){
            System.out.printf("Escreva o nome da %dª pessoa: ",index+1);
            pessoas[index] = new Pessoas(scanner.nextLine(),0);
            System.out.printf("Escreva a idade da %dª pessoa: ",index+1);
            pessoas[index].idade = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println();
        Pessoas pessoaMaisVelha = pessoas[0];
        Pessoas pessoaMaisJovem = pessoas[0];
        int media = 0;

        for(Pessoas pessoa : pessoas){
            if(pessoa.idade > pessoaMaisVelha.idade){
                pessoaMaisVelha = pessoa;
            }
            if(pessoa.idade < pessoaMaisJovem.idade){
                pessoaMaisJovem = pessoa;
            }
            media += pessoa.idade;
        }
        media = media/pessoas.length;
        System.out.printf("A pessoas mais velha é %S e sua idade é %d anos.",pessoaMaisVelha.nome,pessoaMaisVelha.idade);
        System.out.printf("\nA pessoas mais jovem é %S e sua idade é %d anos.",pessoaMaisJovem.nome,pessoaMaisJovem.idade);
        System.out.printf("\nA média das idades é %d anos.",media);
    }
    private static class Pessoas{
        String nome;
        int idade;
        public Pessoas(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }
}

