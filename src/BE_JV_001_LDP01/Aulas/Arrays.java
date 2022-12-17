package BE_JV_001_LDP01.Aulas;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        movimentar();
    }

    public static void movimentar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas da matriz: ");
        int numLinhas = scanner.nextInt();
        System.out.print("Digite o numero de colunas da matriz: ");
        int numColunas = scanner.nextInt();
        Character[][] matrixBase = imprimirMatriz(0, 0, numLinhas, numColunas);

        while (true) {
            System.out.println("-> Pressione 1 para movimentar o X. Ou digite 0 para sair.");
            int movimentar = scanner.nextInt();
            if (movimentar == 1) {
                matrixBase = moverX(matrixBase);
            } else if (movimentar == 0) {
                break;
            }
        }
    }

    private static Character[][] imprimirMatriz(int linha, int coluna, int numLinhas, int numColunas) {
        Character matrizImpressa[][] = new Character[numLinhas][numColunas];
        for (int lin = 0; lin < numLinhas; lin++) {
            System.out.print("[");
            for (int col = 0; col < numColunas; col++) {
                if (lin == linha && col == coluna) {
                    System.out.print(" X ");
                    matrizImpressa[lin][col] = 'X';
                } else {
                    System.out.print(" _ ");
                    matrizImpressa[lin][col] = null;
                }
                if (col == numColunas - 1) {
                    System.out.println("]");
                } else {
                    System.out.print(",");
                }
            }
        }
        return matrizImpressa;
    }

    private static int[] buscarX(Character[][] matriz) {
        int[] posicao = new int[2];
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] != null) {
                    posicao[0] = linha;
                    posicao[1] = coluna;
                    return posicao;
                }
            }
        }
        return posicao;
    }

    private static Character[][] moverX(Character[][] matriz) {
        int numLinha = matriz.length;
        int numColuna = matriz[0].length;
        int [] linhaColunaDoX = buscarX(matriz);
        int novaLinha = linhaColunaDoX[0];
        int novaColuna = linhaColunaDoX[1]+1;
        if (novaColuna > numColuna - 1) {
            novaColuna = novaColuna % numColuna;
            novaLinha++;
            if (novaLinha > numLinha-1) {
                novaLinha = novaLinha % numLinha;
            }
        }
        return imprimirMatriz(novaLinha, novaColuna, numLinha, numColuna);


    }
}

