package BE_JV_001_LDP01.Aulas;
import java.util.Scanner;

public class Horas {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a hora: ");
        int hora = scanner.nextInt();
        System.out.println("Informe os minutos: ");
        int minuto = scanner.nextInt();

        int horaMexico = ((hora-3) +24)%24;
        int horaLondres = (hora+3) %24;

        System.out.printf("Brasil: %d:%d\n",hora,minuto);
        System.out.printf("Mexico: %d:%d\n",horaMexico,minuto);
        System.out.printf("Londres: %d:%d\n",horaLondres,minuto);
    }*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe a hora: ");
            int hora = scanner.nextInt();
            System.out.print("\nInforme os minutos: ");
            int minuto = scanner.nextInt();
            System.out.print("\nInforme quantidade de horas a adicionar: ");
            int horasAdicionar = scanner.nextInt();
            hora = (hora + horasAdicionar) % 24;
            int horaMexico = ((hora-3) +24)%24;
            int horaLondres = (hora+3) %24;

            System.out.printf("\nBrasil: %02d:%02d\n",hora,minuto);
            System.out.printf("Mexico: %02d:%02d\n",horaMexico,minuto);
            System.out.printf("Londres: %02d:%02d\n",horaLondres,minuto);
        }


}
