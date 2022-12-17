package BE_JV_001_LDP01.ProjetoModulo;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        nomearJogadores();
    }
    public static void nomearJogadores() {
        Scanner scanner = new Scanner(System.in);
        Jogadores[] jogadores = new Jogadores[2];
        for (int index = 0; index < jogadores.length; index++) {
            System.out.printf("Digite o nome do %dº jogador: ",index+1);
            jogadores[index] = new Jogadores(scanner.nextLine(),false);
        }
    }
    static class Jogadores {
        String nome;
        boolean vencedor;

        public Jogadores(String nome, boolean vencedor) {
            this.nome = nome;
            this.vencedor = vencedor;
        }
    }
}
