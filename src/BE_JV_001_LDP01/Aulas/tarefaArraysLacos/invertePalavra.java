package BE_JV_001_LDP01.Aulas.tarefaArraysLacos;

import java.util.Scanner;

public class invertePalavra {
    public static void main(String[] args) {
        inverterPalavra();
    }
    public static void inverterPalavra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra que deseja inverter: ");
        String palavra = scanner.nextLine();
        char[] arrayCaracteres = palavra.toCharArray();
        for (int index = arrayCaracteres.length - 1; index >= 0; index--) {
            System.out.print(arrayCaracteres[index]);
        }
        System.out.println();
    }
}

