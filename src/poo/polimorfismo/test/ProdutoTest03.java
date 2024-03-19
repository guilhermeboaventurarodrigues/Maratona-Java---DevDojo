package poo.polimorfismo.test;

import poo.polimorfismo.domain.Tomate;
import poo.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Tomate tomate1 = new Tomate("Tomate 1", 20);
        tomate1.setDataDeValidade("10/12");

        CalculadoraImposto.calcularImpostoProduto(tomate1);
    }
}
