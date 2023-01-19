package BE_JV_001_LDP02.Exercicio_Para_Avaliacao.Util;

public class Sala {

    private Integer numeroSala;
    private Integer ano;
    private Integer mes;
    private Integer dia;


    public Sala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void reservarSala(Integer ano, Integer mes, Integer dia) {
        if(this.ano != null && this.mes != null && this.dia != null) {
            System.out.println("Sala já foi reservada. Tente outra sala");
        }else if(ano <=0 || mes <=0 || dia <= 0) {
            System.out.println("Datas para reserva é invalida");
        }else {
            this.ano = ano;
            this.mes = mes;
            this.dia = dia;
        }
    }
}
