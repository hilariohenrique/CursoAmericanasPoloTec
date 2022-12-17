package BE_JV_001_LDP01.ProjetoModulo;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Jogadores[] jogador = nomearJogadores();
        String[][] tabuleiroDoJogo = gerarTabuleiroInicial();
        while (true) {
            if (verificarJogador(tabuleiroDoJogo, jogador[0])) {
                System.out.println("Fim de jogo !"+jogador[0].toString());
                break;
            }
            if (verificarJogador(tabuleiroDoJogo, jogador[1])) {
                System.out.println("Fim de jogo !"+jogador[1].toString());
                break;
            }
            if (verificarEmpate(tabuleiroDoJogo)){
                System.out.println("Jogo empatado não há mais jogadas.");
                break;
            }
        }
    }

    private static boolean verificarEmpate(String[][] tabuleiro) {
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
        if (verificarColunas(tabuleiro, jogador.simbolo) ||
                verificarLinhas(tabuleiro, jogador.simbolo) ||
                verificarDiagonalDireta(tabuleiro, jogador.simbolo) ||
                verificarDiagonalInversa(tabuleiro, jogador.simbolo)) {
            return true;
        }
        return false;
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
        System.out.println("  1     |     |     ");
        System.out.println("  2     |     |     ");
        System.out.println("  3     |     |     ");
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
