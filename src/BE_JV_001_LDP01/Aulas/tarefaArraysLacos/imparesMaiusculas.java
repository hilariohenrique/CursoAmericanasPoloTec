package BE_JV_001_LDP01.Aulas.tarefaArraysLacos;

import java.util.Scanner;

public class imparesMaiusculas {
    public static void main(String[] args) {
        imparesMaiusculas();
    }
    private static void imparesMaiusculas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String[] arrayCaracteres = palavra.split("");
        for (int index = 0; index < arrayCaracteres.length; index++) {
            if ((index + 1) % 2 == 1) {
                System.out.print(arrayCaracteres[index].toUpperCase());
            } else {
                System.out.print(arrayCaracteres[index]);
            }
        }
        System.out.println();
    }
}
