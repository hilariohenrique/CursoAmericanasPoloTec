package BE_JV_001_LDP02.Exercicio_Para_Avaliação;

import java.util.List;

public class Paciente extends Pessoa {
    private List<String> sintomas;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String endereco, List<String> sintomas) {
        super(nome, cpf, endereco);
        this.sintomas = sintomas;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

}
