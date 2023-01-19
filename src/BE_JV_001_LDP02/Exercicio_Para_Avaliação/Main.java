package BE_JV_001_LDP02.Exercicio_Para_Avaliação;

import BE_JV_001_LDP02.Exercicio_Para_Avaliação.Util.Cirurgia;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("Vitor","021351","Rua talta","123");
        Medico medico = new Medico("Lisy","021351","Rua talta","123");
        Paciente paciente = new Paciente("Tanos","021351","Rua talta");
        Cirurgiao cirurgiao= new Cirurgiao("Ligeirinho","021351","Rua talta","123");


        atendente.iniciarAtendimento(paciente);
        medico.realizarDiagnostico(paciente.getSintomas());
    }
}
