package poo.heranca.test;

import poo.heranca.domain.Endereco;
import poo.heranca.domain.Funcionario;
import poo.heranca.domain.Pessoa;

//0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
//1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar classe filha
//2 - Alocado espaço em memória pro objeto da superclasse
//3 - Cada atributo de superclasse é criado e inicializado com v alores default  ou o que for passado
//4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
//5 - Construtor é executado da superclasse
//6 - Alocado espaco  em memoria pro objeto da subclasse
//7 - Cada atributo de subclasse ´´e criado e inicializado com valores default ou o que for passado
//8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
//9 - Construtor é executado da subclasse

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("38334-42");
        endereco.setRua("Rua Alberto");

        Pessoa pessoa1 = new Pessoa("Guilherme Construtor", "2234542234-12", endereco);
//        pessoa1.setNome("Guilherme");
//        pessoa1.setCpf("2234542234-12");
//        pessoa1.setEndereco(endereco);

        pessoa1.imprime();

        System.out.println("----------------");

        Funcionario func1 = new Funcionario("Jorge Construtor");
//        func1.setNome("Jorge");
        func1.setCpf("122234");
        func1.setEndereco(endereco);

        func1.setSalario("3000 reais");

        func1.imprime();
    }
}
