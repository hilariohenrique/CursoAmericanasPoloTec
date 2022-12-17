package BE_JV_001_LDP01.Aulas.exercicioTempo;
import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();
        System.out.print("Informe o mes: ");
        int mes = scanner.nextInt();
        System.out.print("Informe o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Informe a hora: ");
        int hora = scanner.nextInt();
        System.out.print("Informe o minuto: ");
        int minuto = scanner.nextInt();
        System.out.print("Informe o segundo: ");
        int segundo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe o valor a adicionar e o parametro a modificar [Y, M, D, h, m, s]: ");
        String modificador = scanner.nextLine();
        Tempo data = new Tempo(ano,mes,dia,hora,minuto,segundo,modificador);
        System.out.println(data.toString());
        data.recalcularData();
        System.out.println(data.toString());
    }
    int ano;
    int mes;
    int dia;
    int hora;
    int minuto;
    int segundo;
    String modificador;

    public Tempo(int ano, int mes, int dia, int hora, int minuto, int segundo, String modificador) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.modificador = modificador;
    }

    @Override
    public String toString() {
        return (this.ano + "/" + this.mes + "/" + this.dia + " " + this.hora + ":" + this.minuto + ":" + this.segundo);
    }

    public void recalcularData() {
        String paramentro = this.modificador.substring(this.modificador.length() - 1);
        int valor = Integer.parseInt(this.modificador.substring(0, this.modificador.length() - 1));
        switch (paramentro) {
            case "Y" -> {
                tratarAno(valor);
            }
            case "M" -> {
                tratarMes(valor);
            }
            case "D" -> {
                tratarDia(valor);
            }
            case "h" -> {
                tratarHoras(valor);
            }
            case "m" -> {
                tratarMinutos(valor);
            }
            case "s" -> {
                tratarSegundos(valor);
            }
        }
    }

    public void tratarAno(int ano) {
        this.ano += ano;
    }

    public void tratarMes(int mes) {
        this.mes += mes;
        if (this.mes >= 12) {
            tratarAno(this.mes / 12);
            this.mes = this.mes % 12;
        }

    }

    public void tratarDia(int dias) {
        for(int count = 0; count < dias;count++){
            this.dia++;
            if(this.dia > getDiasMes(this.mes,this.ano)){
                this.dia=1;
                tratarMes(1);
            }
        }

    }

    private int getDiasMes(int mes, int ano) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (((ano % 4 == 0) && (ano % 100 != 0)) || ano % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            }
            default -> {
                return 30;
            }
        }
    }

    public void tratarHoras(int horas) {
        this.hora += horas;
        if (this.hora >= 24) {
            tratarDia(this.hora / 24);
            this.hora = this.hora % 24;
        }
    }

    public void tratarMinutos(int minutos) {
        this.minuto += minutos;
        if (this.minuto >= 60) {
            tratarHoras(this.minuto / 60);
            this.minuto = this.minuto % 60;
        }
    }

    public void tratarSegundos(int segundos) {
        this.segundo += segundos;
        if (this.segundo >= 60) {
            tratarMinutos(this.segundo / 60);
            this.segundo = this.segundo % 60;
        }
    }
}
