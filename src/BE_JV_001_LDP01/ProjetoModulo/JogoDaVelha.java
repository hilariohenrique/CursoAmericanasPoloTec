package BE_JV_001_LDP01.ProjetoModulo;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Jogadores [] jogadores = nomearJogadores();
        String [][] tabuleiroDoJogo = gerarTabuleiroInicial();



    }

    private static String[][] gerarTabuleiroInicial() {
        String [][] matrizTabuleiro= new String[3][3];
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
            if(index==1) {
                simboloDoJogador="X";
            }
            System.out.printf("Digite o nome do %dº jogador: ",index+1);
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
            return this.nome+" venceu esta partida.";
        }

    }
}
