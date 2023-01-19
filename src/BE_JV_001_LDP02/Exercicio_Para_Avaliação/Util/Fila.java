package BE_JV_001_LDP02.Exercicio_Para_Avaliação.Util;

import BE_JV_001_LDP02.Exercicio_Para_Avaliação.Atendente;
import BE_JV_001_LDP02.Exercicio_Para_Avaliação.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fila {
    private final List<Paciente> filaEspera = new ArrayList<Paciente>();

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
