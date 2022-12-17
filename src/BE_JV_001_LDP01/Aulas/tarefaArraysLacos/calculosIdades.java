package BE_JV_001_LDP01.Aulas.tarefaArraysLacos;

import java.util.Scanner;

public class calculosIdades {
    public static void main(String[] args) {
        maiorMenorMedia();
    }
    private static void maiorMenorMedia() {
        Scanner scanner = new Scanner(System.in);
        int[] listaNumeros = new int[5];
        for (int num = 0; num < listaNumeros.length; num++) {
            System.out.printf("Informe o %dº numero: ", num + 1);
            listaNumeros[num] = scanner.nextInt();
        }
        int maior = listaNumeros[0], menor = listaNumeros[0], media = 0;
        for (int numero : listaNumeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            media += numero;
        }
        media = media / listaNumeros.length;
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
        System.out.println("O média é: " + media);
    }
}
