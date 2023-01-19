package BE_JV_001_LDP02.Exercicio_Para_Avaliação;

import java.util.List;

public class Paciente extends Pessoa {
    private List<String> sintomas;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);

    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

}
