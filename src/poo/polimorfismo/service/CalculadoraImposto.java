package poo.polimorfismo.service;

import poo.polimorfismo.domain.Produto;
import poo.polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoProduto(Produto produto){
        System.out.println("Relatório de imposto do Produto");
        double imposto = produto.calcularImposto();
        System.out.println("Nome produto: "+produto.getNome());
        System.out.println("Valor produto: "+produto.getValor());
        System.out.println("Imposto produto: "+imposto);
        if (produto instanceof Tomate){
            Tomate tomate1 = (Tomate) produto;
            System.out.println("Data de validade: "+tomate1.getDataDeValidade());
        }
    }
}
