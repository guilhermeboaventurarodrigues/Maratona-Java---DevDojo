package poo.metodos.test;

import poo.metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros(10,20);

        double result = calc.divideDoisNumeros(50,10);
        System.out.println(result);

        int[] a = {1,2,3,4,5};
        calc.somaArray(a);

        calc.somaVarArgs(1,2,3,4,5,6);
    }
}
