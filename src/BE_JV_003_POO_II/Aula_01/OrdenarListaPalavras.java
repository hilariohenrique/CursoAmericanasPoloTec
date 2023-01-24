package BE_JV_003_POO_II.Aula_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarListaPalavras {


    public static void main(String[] args) {
        List<String> listaPalavras = new ArrayList<String>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Para sair digite S ou digite uma palavra para adicionar a lista: ");
            String palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("S")) {
                break;
            }
            listaPalavras.add(palavra);
        }
        System.out.println("Lista: "+listaPalavras);
        Collections.sort(listaPalavras);
        System.out.println("Lista ordenada: "+listaPalavras);
    }

}
