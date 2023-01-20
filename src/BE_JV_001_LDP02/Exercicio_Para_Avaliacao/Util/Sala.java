package BE_JV_001_LDP02.Exercicio_Para_Avaliacao.Util;

public class Sala {

    private Integer numeroSala; /**A Variável numeroSala deve ser um valor de 1 a 10. Só temos 10 salas*/
    private Integer ano;
    private Integer mes;
    private Integer dia;

    public Sala(Integer numeroSala) {
        if(1 <= numeroSala && numeroSala <=10){
            this.numeroSala = numeroSala;
        }
        else{
            System.out.println("O número de sala deve ser de 1 a 10. Não foi possível criar a sala.");
        }
    }

    public void reservarSala(Integer ano, Integer mes, Integer dia) {
        if (this.ano != null && this.mes != null && this.dia != null) {
            System.out.println("Sala já foi reservada nesta data. Tente outra sala ou outra data");
        } else if (ano < 2023 || mes < 1 || mes >12 || dia < 1 || dia >31) {
            System.out.println("Data para reserva é invalida");
        } else {
            this.ano = ano;
            this.mes = mes;
            this.dia = dia;
            System.out.println("Sala foi reservada com sucesso.");
        }
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala sala = (Sala) object;
        return this.numeroSala == sala.numeroSala && this.ano==sala.ano &&
                this.mes == sala.mes && this.dia == sala.dia;
    }
}
