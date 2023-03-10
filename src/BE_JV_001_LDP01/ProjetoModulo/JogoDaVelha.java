package BE_JV_001_LDP01.ProjetoModulo;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Jogador[] jogadores = nomearJogadores();
        String[][] tabuleiroDoJogo = gerarTabuleiroInicial();
        int jogadorAJogar = 0;
        while (true) {
            tabuleiroDoJogo = realizarJogada(jogadorAJogar, jogadores, tabuleiroDoJogo);
            desenharTabuleiro(tabuleiroDoJogo);
            if (verificarJogador(tabuleiroDoJogo, jogadores[0])) {
                System.out.println(jogadores[0].vencedor());
                break;
            }
            if (verificarJogador(tabuleiroDoJogo, jogadores[1])) {
                System.out.println(jogadores[1].vencedor());
                break;
            }
            if (verificarEmpate(tabuleiroDoJogo)) {
                System.out.println("\nJogo deu Velha \uD83D\uDC75\uD83C\uDFFD. Não há mais jogadas. Inicie o jogo novamente.");
                break;
            }
            jogadorAJogar = proximoJogador(jogadorAJogar);
        }
    }

    private static void desenharTabuleiro(String[][] tabuleiro) {
        System.out.println("      C-0  |  C-1  |  C-2  ");
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (coluna == 0) {
                    if (tabuleiro[linha][coluna] != null) {
                        System.out.printf("  L-%d  %S   |", linha, tabuleiro[linha][coluna]);
                    } else {
                        System.out.printf("  L-%d  %S   |", linha, " ");
                    }
                } else if (coluna == tabuleiro.length - 1) {
                    if (tabuleiro[linha][coluna] != null) {
                        System.out.printf("   %S  \n", tabuleiro[linha][coluna]);
                    } else {
                        System.out.printf("      \n");
                    }
                } else {
                    if (tabuleiro[linha][coluna] != null) {
                        System.out.printf("   %S   |", tabuleiro[linha][coluna]);
                    } else {
                        System.out.printf("       |");
                    }
                }
            }
        }
    }

    private static String[][] realizarJogada(int jogadorAJogar, Jogador[] jogadores, String[][] tabuleiro) {
        while (true) {
            int[] linhaColuna = solicitarPosicao(jogadores[jogadorAJogar].getNome());
            if (verificaPosicaoEValida(linhaColuna, tabuleiro)) {
                if (verificarSePosicaoOcupada(linhaColuna, tabuleiro)) {
                    tabuleiro[linhaColuna[0]][linhaColuna[1]] = jogadores[jogadorAJogar].getSimbolo();
                    return tabuleiro;
                } else {
                    System.err.println("A posição escolhida já está marcada, tente novamente.");
                }
            } else {
                System.err.println("A posição escolhida não é válida, tente novamente.");
            }
        }
    }

    private static boolean verificaPosicaoEValida(int[] linhaColuna, String[][] tabuleiro) {

        if (linhaColuna[0] < 0 || linhaColuna[0] > tabuleiro.length - 1 ||
                linhaColuna[1] < 0 || linhaColuna[1] > tabuleiro.length - 1) {
            return false;
        }
        return true;
    }

    private static boolean verificarSePosicaoOcupada(int[] linhaColuna, String[][] tabuleiro) {
        return tabuleiro[linhaColuna[0]][linhaColuna[1]] == null;
    }

    private static int[] solicitarPosicao(String nome) {
        Scanner scanner = new Scanner(System.in);
        int[] posicao = new int[2];
        System.out.printf("Vez do jogador %S. \n", nome);
        while (true) {
            try {
                System.out.print("Digite a linha da sua jogada: ");
                posicao[0] = scanner.nextInt();
                System.out.print("Agora digite a coluna da sua jogada: ");
                posicao[1] = scanner.nextInt();
                return posicao;
            } catch (Exception ex) {
                System.out.println("Você não digitou um número. Digite apenas números.");
                scanner.nextLine();
            }
        }
    }


    private static int proximoJogador(int numeroJogador) {
        if (numeroJogador == 0) {
            return 1;
        }
        return 0;
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

    private static boolean verificarJogador(String[][] tabuleiro, Jogador jogador) {
        if (verificarColunas(tabuleiro, jogador.getSimbolo()) ||
                verificarLinhas(tabuleiro, jogador.getSimbolo()) ||
                verificarDiagonalDireta(tabuleiro, jogador.getSimbolo()) ||
                verificarDiagonalInversa(tabuleiro, jogador.getSimbolo())) {
            return true;
        }
        return false;
    }

    private static boolean verificarColunas(String[][] tabuleiro, String simbolo) {
        for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
            int pontosColuna = 0;
            for (int linha = 0; linha < tabuleiro.length; linha++) {
                if (tabuleiro[linha][coluna] == simbolo) {
                    pontosColuna++;
                }
            }
            if (pontosColuna == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean verificarLinhas(String[][] tabuleiro, String simbolo) {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            int pontosLinha = 0;
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (tabuleiro[linha][coluna] == simbolo) {
                    pontosLinha++;
                }
            }
            if (pontosLinha == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean verificarDiagonalDireta(String[][] tabuleiro, String simbolo) {
        for (int linhaColuna = 0; linhaColuna < tabuleiro.length; linhaColuna++) {
            if (tabuleiro[linhaColuna][linhaColuna] != simbolo) {
                return false;
            }
        }
        return true;
    }

    private static boolean verificarDiagonalInversa(String[][] tabuleiro, String simbolo) {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (linha + coluna == tabuleiro.length - 1) {
                    if (tabuleiro[linha][coluna] != simbolo) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static String[][] gerarTabuleiroInicial() {
        String[][] matrizTabuleiro = new String[3][3];
        System.out.println("      C-0  |  C-1  |  C-2  ");
        System.out.println("  L-0      |       |     ");
        System.out.println("  L-1      |       |     ");
        System.out.println("  L-2      |       |     ");
        return matrizTabuleiro;
    }


    public static Jogador[] nomearJogadores() {
        Scanner scanner = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[2];
        for (int index = 0; index < jogadores.length; index++) {
            String simboloDoJogador = "O";
            if (index == 1) {
                simboloDoJogador = "X";
            }
            System.out.printf("Digite o nome do %dº jogador: ", index + 1);
            jogadores[index] = new Jogador(scanner.nextLine(), simboloDoJogador);

        }
        return jogadores;
    }

    public static class Jogador {


        String nome;
        String simbolo;

        public Jogador(String nome, String simbolo) {
            this.nome = nome;
            this.simbolo = simbolo;
        }

        public String getNome() {
            return this.nome;
        }

        public String getSimbolo() {
            return this.simbolo;
        }

        public String vencedor() {
            return "\nFim de jogo ! " +this.nome + " venceu esta partida.";
        }

    }
}
