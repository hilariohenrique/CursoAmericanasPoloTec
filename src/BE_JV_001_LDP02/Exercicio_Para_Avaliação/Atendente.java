package BE_JV_001_LDP02.Exercicio_Para_Avaliação;


public class Atendente extends Funcionario{
    private final String cargo = "Atendente";
    private final String setor = "Recepcao";

    public Atendente(){

    }

    public Atendente(String nome, String cpf, String endereco, String matricula) {
        super(nome, cpf, endereco, matricula);
        super.setCargo(this.cargo);
        super.setSetor(this.setor);
    }
    public final void iniciarAtendimento(Paciente paciente){
        System.out.println("Atendente está iniciando atendimento");

        System.out.println("Atendente finalizou o atendimento e encaminhou o paciente para sala de espera e o colocou na fila");


    }
}
