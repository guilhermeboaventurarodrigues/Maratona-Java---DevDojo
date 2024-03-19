package poo.polimorfismo.test;

import poo.polimorfismo.domain.Computador;
import poo.polimorfismo.domain.Produto;
import poo.polimorfismo.domain.Televisao;
import poo.polimorfismo.domain.Tomate;
import poo.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produtoTomate = new Tomate("Tomate Italiano", 20);
        Produto produtoComputador = new Computador("PC produto", 2000);
        Produto produtoTV = new Televisao("TV 50\" ",200);

        CalculadoraImposto.calcularImpostoProduto(produtoTomate);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImpostoProduto(produtoComputador);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImpostoProduto(produtoTV);
    }
}