package BE_JV_001_LDP02.Exercicio_Para_Avaliação;


public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Pessoa))
            return false;
        Pessoa pessoa = (Pessoa) object;
        if (this == pessoa) return true;
        return this.nome == pessoa.getNome() && this.cpf == pessoa.getCpf() &&
                this.endereco == pessoa.getEndereco();

    }

}