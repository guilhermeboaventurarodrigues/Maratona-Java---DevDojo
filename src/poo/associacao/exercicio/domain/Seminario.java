package poo.associacao.exercicio.domain;

public class Seminario {
    private String titulo;

    private Aluno[] alunos;

    private Local local;


    public void imprime(){
        System.out.println("Titulo seminario: "+this.titulo);
        if (alunos == null) return;
        for(Aluno aluno : alunos){
            System.out.println("Alunos incritos nesse seminário: "+aluno.getNome());
        }
        if (local == null) return;
        System.out.println("Esse seminário vai ser no local: "+local.getEndereco());
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
