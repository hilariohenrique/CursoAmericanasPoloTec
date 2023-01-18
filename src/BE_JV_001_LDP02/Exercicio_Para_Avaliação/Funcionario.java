package BE_JV_001_LDP02.Exercicio_Para_Avaliação;

public class Funcionario extends Pessoa{
    private String matricula;
    private String setor;
    private String cargo;


    public Funcionario(){

    }

    @Override
    public boolean equals(Pessoa pessoa) {
        return false;
    }

    public Funcionario(String nome, String cpf,String endereco, String matricula) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
