package BE_JV_001_LDP01.Aulas.tarefaArraysLacos;
import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        imcIdeal();
    }
    private static void imcIdeal() {
        Scanner scanner = new Scanner(System.in);
        Pessoas[] pessoas = new Pessoas[5];
        double imcMax = 25d;
        double imcMin = 18.5d;
        for (int index = 0; index < pessoas.length; index++) {
            System.out.printf("Informe o nome da %dª pessoa: ", index + 1);
            pessoas[index] = new Pessoas(scanner.nextLine(), 0d, 0d, 0d, true);
            System.out.printf("Informe a altura de %S em metros: ", pessoas[index].nome, index + 1);
            pessoas[index].altura = scanner.nextDouble();
            System.out.printf("Informe o peso de %S em quilos: ", pessoas[index].nome, index + 1);
            pessoas[index].peso = scanner.nextDouble();
            pessoas[index].imc = pessoas[index].peso / (pessoas[index].altura * pessoas[index].altura);
            if (pessoas[index].imc <= imcMin || pessoas[index].imc >= imcMax) {
                pessoas[index].imcOk = false;
            }
            scanner.nextLine();
        }
        boolean imcFora = false;
        for (Pessoas pessoa : pessoas) {
            if (!pessoa.imcOk) {
                imcFora = true;
                System.out.println(pessoa.toString());
            }
        }
        if (!imcFora) {
            System.out.println("\nNão ha pessoas com IMC fora da faixa.");
        }
    }
    private static class Pessoas {
        String nome;
        double altura;
        double peso;
        double imc;
        boolean imcOk;

        public Pessoas(String nome, double altura, double peso, double imc, boolean imcOk) {
            this.nome = nome;
            this.altura = altura;
            this.peso = peso;
            this.imc = imc;
            this.imcOk = imcOk;
        }

        @Override
        public String toString() {
            return "\nO IMC de " + nome + " é " + imc + " e está fora da faixa.";
        }
    }
}


