package BE_JV_002_POO_I.Exercicio_20_01_23;

public class Computador extends Produto{
    private String marca;
    private String processador;
    private String memoria;


    public Computador(String nome, Double preco, String codigo, String marca, String processador, String memoria) {
        super(nome, preco, codigo);
        this.marca = marca;
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoria() {
        return memoria;
    }
}
