package poo.sobrecargametodos.domain;

public class Serie {
    private String name;
    private int eps;
    private String type;
    private int age;
    public void init (String name, String type, int eps){
        this.name = name;
        this.type = type;
        this.eps = eps;
    }

    public void init (String name, String type, int eps, int age){
        this.init(name, type, eps);
        this.age = age;
    }

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.eps);
        System.out.println(this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
