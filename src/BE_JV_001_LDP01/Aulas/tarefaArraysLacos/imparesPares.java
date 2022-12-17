package BE_JV_001_LDP01.Aulas.tarefaArraysLacos;

import java.util.Scanner;

public class imparesPares {
    public static void main(String[] args) {
        imparesPares();
    }
    public static void imparesPares(){
        Scanner scanner = new Scanner(System.in);
        int [] listaNumeros = new int[5];
        String numerosImpares = "Numeros ímpares são : ", numerosPares = "Números pares são : ";
        for(int num = 0; num < listaNumeros.length; num++){
            System.out.printf("Digite o %dº numero: ",num+1);
            int numero = scanner.nextInt();
            if(numero%2==0){
                numerosPares+= Integer.toString(numero)+" ";
            }
            else{
                numerosImpares+= Integer.toString(numero)+" ";
            }
        }
        System.out.println(numerosImpares+"\n"+numerosPares);
    }
}
