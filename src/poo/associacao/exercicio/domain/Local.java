package poo.associacao.exercicio.domain;

public class Local {
    private String endereco;
    private Seminario[] seminario;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("Local: "+this.endereco);
        if (seminario == null) return;
        for(Seminario seminario : seminario){
            System.out.println("Seminários nesse local: "+seminario.getTitulo());
        }
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
