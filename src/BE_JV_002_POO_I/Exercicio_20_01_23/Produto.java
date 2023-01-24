package BE_JV_001_LDP02.Exercicio_20_01_23;

public abstract class Produto {
    private String nome;
    private Double preco;
    private String codigo;


    public Produto(String nome, Double preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

}
