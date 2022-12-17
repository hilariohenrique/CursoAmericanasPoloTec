package BE_JV_001_LDP01.ProjetoModulo;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Jogadores[] jogadores = nomearJogadores();
        String[][] tabuleiroDoJogo = gerarTabuleiroInicial();
        while (!verificarEmpate() ||
                verificarJogador(tabuleiroDoJogo,jogadores[0]) ||
                verificarJogador(tabuleiroDoJogo,jogadores[1] )) {
        }
    }

    private static boolean verificarEmpate(String[][] tabuleiro) {
        //Verificar espaços vazios
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (tabuleiro[linha][coluna] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean verificarJogador(String[][] tabuleiro, Jogadores jogador) {
        boolean venceu;
        venceu = verificarColunas(tabuleiro, jogador.simbolo);
        venceu = verificarLinhas(tabuleiro, jogador.simbolo);
        venceu = verificarDiagonalDireta(tabuleiro, jogador.simbolo);
        venceu = verificarDiagonalInversa(tabuleiro, jogador.simbolo);
        return venceu;
    }

    private static boolean verificarColunas(String[][] tabuleiro, String simbolo) {
        for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
            for (int linha = 0; linha < tabuleiro.length; linha++) {
                if (!tabuleiro[linha][coluna].equalsIgnoreCase(simbolo)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean verificarLinhas(String[][] tabuleiro, String simbolo) {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (!tabuleiro[linha][coluna].equalsIgnoreCase(simbolo)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean verificarDiagonalDireta(String[][] tabuleiro, String simbolo) {
        for (int linhaColuna = 0; linhaColuna < tabuleiro.length; linhaColuna++) {
            if (!tabuleiro[linhaColuna][linhaColuna].equalsIgnoreCase(simbolo)) {
                return false;
            }
        }
        return true;
    }

    private static boolean verificarDiagonalInversa(String[][] tabuleiro, String simbolo) {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (linha + coluna == tabuleiro.length - 1) {
                    if (!tabuleiro[linha][coluna].equalsIgnoreCase(simbolo)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static String[][] gerarTabuleiroInicial() {
        String[][] matrizTabuleiro = new String[3][3];
        System.out.println("     1  |  2  |  3  ");
        System.out.println("  1  _  |  _  |  _  ");
        System.out.println("  2  _  |  _  |  _  ");
        System.out.println("  3  _  |  _  |  _  ");
        return matrizTabuleiro;
    }


    public static Jogadores[] nomearJogadores() {
        Scanner scanner = new Scanner(System.in);
        Jogadores[] jogadores = new Jogadores[2];
        for (int index = 0; index < jogadores.length; index++) {
            String simboloDoJogador = "O";
            if (index == 1) {
                simboloDoJogador = "X";
            }
            System.out.printf("Digite o nome do %dº jogador: ", index + 1);
            jogadores[index] = new Jogadores(scanner.nextLine(), false, simboloDoJogador);

        }
        return jogadores;
    }

    static class Jogadores {
        String nome;
        boolean vencedor;
        String simbolo;

        public Jogadores(String nome, boolean vencedor, String simbolo) {
            this.nome = nome;
            this.vencedor = vencedor;
            this.simbolo = simbolo;
        }

        @Override
        public String toString() {
            return this.nome + " venceu esta partida.";
        }

    }
}
