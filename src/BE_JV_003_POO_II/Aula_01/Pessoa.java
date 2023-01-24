package BE_JV_003_POO_II.Aula_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa implements Comparable {
    private final String nome;
    private final LocalDate date;

    public Pessoa(String nome, LocalDate date) {
        this.nome = nome;
        this.date = date;
    }

    @Override
    public int compareTo(Object object) {
        if (!(object instanceof Pessoa)) {
            throw new IllegalArgumentException("Passaram o objeto errado! Só aceito pessoa");
        }
        Pessoa outraPessoa = (Pessoa) object;
        return this.nome.compareTo(outraPessoa.nome);
    }

    @Override
    public String toString() {
        return this.nome+" - "+this.date.format(DateTimeFormatter.ISO_DATE);
    }

}
