package poo.metodos.domain;

public class Funcionario {
    private String name;
    private int age;
    private int[] salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (int num : this.salary) {
            System.out.print(num + " ");
        }
    }

    public void media() {
        int soma = 0;
        for (int num : this.salary) {
            soma += num;
        }
        int media = soma / this.salary.length;
        System.out.println("\nA soma desses salários é: " + soma);
        System.out.println("A média desses salários é: " + media);
    }
}
