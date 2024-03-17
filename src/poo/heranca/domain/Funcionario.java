package poo.heranca.domain;

public class Funcionario extends Pessoa{
    private String salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void relatorio(){
        System.out.println("Eu "+this.nome+" recebi o valor de "+this.salario);
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
