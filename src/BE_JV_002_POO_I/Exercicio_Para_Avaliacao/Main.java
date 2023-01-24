package BE_JV_002_POO_I.Exercicio_Para_Avaliacao;

import BE_JV_002_POO_I.Exercicio_Para_Avaliacao.Util.Sala;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("Vitor","021351","Rua talta","123");
        Medico medico = new Medico("Lisy","021351","Rua talta","123");
        Paciente paciente = new Paciente("Tanos","021351","Rua talta");
        Cirurgiao cirurgiao= new Cirurgiao("Ligeirinho","021351","Rua talta","123");
        Sala sala1 = new Sala(1);

        atendente.iniciarAtendimento(paciente);

        medico.realizarDiagnostico(paciente.getSintomas());
        sala1.reservarSala(2023,1,30);
    }
}
