package BE_JV_001_LDP02.Exercicio_Para_Avaliação;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("Leo","021351","Rua talta","123");
        Medico medico = new Medico("Le o","021351","Rua talta","123");
        System.out.println(atendente.equals(medico));
//        System.out.println(atendente.toString());
//        Medico medico = new Medico("Barrabas", "23568","Rua fulanodetal","1122");
////        medico.realizarDiagnostico();

    }
}
