package BE_JV_001_LDP01.Aulas;

import java.util.Scanner;

public class somaDosMinutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a hora: ");
        int hora = scanner.nextInt();
        System.out.print("Informe os minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Informe os minutos a serem somados: ");
        int acrescimo = scanner.nextInt();

        minutos = minutos + acrescimo;
        calcularNovoHorario("Brasil", tratarHora(hora, minutos, 0), tratarMinutos(minutos));
        calcularNovoHorario("Mexico", tratarHora(hora, minutos, -3), tratarMinutos(minutos));
        calcularNovoHorario("Londres", tratarHora(hora, minutos, 3), tratarMinutos(minutos));


    }

    public static int tratarMinutos(int minutos) {
        return minutos % 60;
    }

    public static int tratarHora(int hora, int minuto, int fuso) {
        return ((hora + minuto / 60 + fuso) + 24) % 24;
    }

    public static void calcularNovoHorario(String local, int hora, int minuto) {
        System.out.printf("Horario %s %d hh %d mm\n", local, hora, minuto);
    }


}
