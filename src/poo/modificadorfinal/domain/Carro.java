package poo.modificadorfinal.domain;

public class Carro {
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR1 = new Comprador();
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
