package BE_JV_001_LDP02.Exercicio_Para_Avaliação.Util;

public final class Cirurgia {
    private String nomeCirugiao;
    private String tipoCirurgia;
    private long dataCirurgia;

    public Cirurgia() {
    }


    public void marcarCirurgia(String nomeCirugiao, String tipoCirurgia, long dataCirurgia) {
        this.nomeCirugiao = nomeCirugiao;
        this.tipoCirurgia = tipoCirurgia;
        this.dataCirurgia = dataCirurgia;
    }

    public String realizarCirurgia(int anoAtual, int mesAtual, int diaHoje) {
        long dataAtual = anoAtual + mesAtual + diaHoje;
        if (dataAtual <= 0) {
            return "Data menor ou igual a zero. Favor corrigir a data.";
        } else {
            if (this.dataCirurgia < dataAtual) {
                return "Cirurgia ainda não foi realizada. A data é anterior a data marcada para cirurgia.";
            } else if (this.dataCirurgia == dataAtual) {
                return "A cirurgia deve ser realizada hoje.";
            } else if (this.dataCirurgia > dataAtual) {
                return "Cirurgia já foi realizada.";
            }
        }
        return null;
    }

    public String getNomeCirugiao() {
        return nomeCirugiao;
    }

    public void setNomeCirugiao(String nomeCirugiao) {
        this.nomeCirugiao = nomeCirugiao;
    }

    public long getDataCirurgia() {
        return dataCirurgia;
    }

    public void setDataCirurgia(long dataCirurgia) {
        this.dataCirurgia = dataCirurgia;
    }
}
