package BE_JV_002_POO_I.Exercicio_Para_Avaliacao;


import BE_JV_002_POO_I.Exercicio_Para_Avaliacao.Util.Fila;

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
        Fila fila = new Fila();
        fila.adicionarAFila(paciente);
        System.out.println("Atendente finalizou o atendimento e encaminhou o paciente para sala de espera e o colocou na fila");


    }
}
