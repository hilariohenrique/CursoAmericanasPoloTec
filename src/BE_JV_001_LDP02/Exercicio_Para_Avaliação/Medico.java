package BE_JV_001_LDP02.Exercicio_Para_Avaliação;

import BE_JV_001_LDP02.Exercicio_Para_Avaliação.Util.Sintomas;

import java.util.List;

public class Medico extends Funcionario{
    private final String cargo = "Médico";
    private final String setor = "Consultórios";

    public Medico(){

    }

    public Medico(String nome, String cpf, String endereco, String matricula) {
        super(nome, cpf, endereco, matricula);
        super.setCargo(this.cargo);
        super.setSetor(this.setor);
    }
    public final String realizarDiagnostico(List<String> sintomas){
        if(sintomas.size()==0) {
            return "A lista de sintomas está vazia. Não é possível fazer o diagnósticos.";
        }
        else {
            Sintomas listarSintomas = new Sintomas();

            List<String> gradeDeSintomas = listarSintomas.Sintomas();
            Integer grauDiagnostico = null;
            for (int s = 0; s < sintomas.size(); s++) {
                for (int ls = 0; ls < gradeDeSintomas.size(); ls++) {
                    if (sintomas.get(s) == gradeDeSintomas.get(ls)) {
                        grauDiagnostico += ls + 1;
                        break;
                    }
                }
            }
            return "Pelos sintomas informados a criticidade do paciente é " + grauDiagnostico + " / 21.";
        }
    }
}
