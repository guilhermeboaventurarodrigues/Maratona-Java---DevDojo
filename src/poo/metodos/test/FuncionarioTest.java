package poo.metodos.test;

import poo.metodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setName("Guilherme");
        func.setAge(20);
        func.setSalary(new int[]{1200,2300,3000});

        func.imprime();
        func.media();

        System.out.println(func.getAge());
    }
}
