package BE_JV_001_LDP01.Aulas;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //boolean run= true;
        loopMenu: while (true) {
            System.out.println("Qual função deseja utilizar:\n" +
                    "\n1 - Maior numero" +
                    "\n2 - Gerar numeros de um intervalo" +
                    "\n3 - Tabuada 1 ao 9" +
                    "\nPara sair digite S");
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1" -> {
                    maior();
                }
                case "2" -> {
                    intervalo();
                }
                case "3" -> {
                    tabuada();
                }
                default -> {
                    System.out.println("Programa finalizado");
                    break loopMenu;
                    //run=false;
                }
            }
        }
    }

    public static void maior() {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = Integer.MIN_VALUE;
        for (int numero = 0; numero < 5; numero++) {
            System.out.printf("Digite o %dº numero: ", numero + 1);
            int numeroRecebido = scanner.nextInt();
            if (numeroRecebido >= maiorNumero) {
                maiorNumero = numeroRecebido;
            }
        }
        System.out.println("O maior número é: " + maiorNumero);

    }

    public static void intervalo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero do intervalo: ");
        int numMaior = scanner.nextInt();
        System.out.print("Digite o ultimo numero do intervalo: ");
        int numMenor = scanner.nextInt();
        int auxiliar;
        if (numMaior < numMenor) {
            auxiliar = numMaior;
            numMaior = numMenor;
            numMenor = auxiliar;
        }
        System.out.println("Neste intervalo estão os seguintes números:");
        for (int numero = numMenor; numero <= numMaior; numero++) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    public static void tabuada(){
        for(int numA = 1; numA<=9;numA++) {
            for (int numB = 1; numB <= 9; numB++) {
                System.out.printf("%d x %d = %d\n", numA, numB, numA * numB);
            }
            System.out.println("- - - - - - - - - - - - - ");
        }

    }
}
