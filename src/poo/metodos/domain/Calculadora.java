package poo.metodos.domain;

public class Calculadora {
    public void somaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
