package BE_JV_001_LDP01.Aulas.tarefaArraysLacos;

public class crescimentoPopulacoes {
    public static void main(String[] args) {

        taxaCrescimentoPaises();
    }
    private static void taxaCrescimentoPaises() {
        int populacaoPaisA = 80_000;
        double crescimentoA = 3d;
        int populacaoPaisB = 200_000;
        double crescimentoB = 1.5d;
        int contadorAnos= 0;

        while(populacaoPaisA<populacaoPaisB){
            populacaoPaisA*=(1+crescimentoA/100);
            populacaoPaisB*=(1+crescimentoB/100);
            contadorAnos++;
        }
        System.out.println("População país A = "+populacaoPaisA);
        System.out.println("População país B = "+populacaoPaisB);
        System.out.printf("Foram necessários %d anos.",contadorAnos);
    }
}
