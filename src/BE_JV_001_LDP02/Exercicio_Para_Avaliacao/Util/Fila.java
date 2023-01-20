package BE_JV_001_LDP02.Exercicio_Para_Avaliacao.Util;

import BE_JV_001_LDP02.Exercicio_Para_Avaliacao.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Fila {

    private List<Paciente> filaEspera = new ArrayList<Paciente>();

    public List<Paciente> adicionarAFila(Paciente paciente) {
        this.filaEspera.add(paciente);
        return filaEspera;
    }


    public List<Paciente> removerDaFila(Paciente paciente) {
        for(Paciente p: filaEspera) {
            if (p.equals(paciente)) {
                this.filaEspera.remove(paciente);
                break;
            }
        }
        return filaEspera;
    }


}
