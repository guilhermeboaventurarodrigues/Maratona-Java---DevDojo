package poo.polimorfismo.test;

import poo.polimorfismo.domain.Computador;
import poo.polimorfismo.domain.Tomate;
import poo.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador1 = new Computador("PC 1", 2000);
        Tomate tomate1 = new Tomate("Tomate 1", 20);

        //Se as funções NÃO estiverem como estático precisa criar um objeto.
//        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
//        calculadoraImposto.calcularImpostoComputador(computador1);

//        CalculadoraImposto.calcularImpostoComputador(computador1);
//        System.out.println("---------------------------");
//        CalculadoraImposto.calcularImpostoTomatte(tomate1);
    }
}
