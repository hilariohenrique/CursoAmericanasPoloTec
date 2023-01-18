package BE_JV_001_LDP02.Exercicio_Para_Avaliação.Util;

import BE_JV_001_LDP02.Exercicio_Para_Avaliação.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<String>  filaEspera= new ArrayList<String>();
    public List<String> adicionarAFila(Paciente paciente){
        this.filaEspera.add(paciente.getNome());
        return filaEspera;
    }
}
