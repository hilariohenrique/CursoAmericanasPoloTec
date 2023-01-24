package BE_JV_002_POO_I.Exercicio_Para_Avaliacao;

public class Cirurgiao extends Funcionario{
    private final String cargo = "Cirurgião";
    private final String setor = "Centro Cirúrgico";

    public Cirurgiao(String nome, String cpf, String endereco, String matricula) {
        super(nome, cpf, endereco, matricula);
        super.setCargo(this.cargo);
        super.setSetor(this.setor);
    }
}
