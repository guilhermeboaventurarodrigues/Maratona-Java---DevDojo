package poo.modificadorfinal.test;

import poo.modificadorfinal.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1  = new Carro();

        System.out.println(carro1.COMPRADOR1);
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro1.COMPRADOR1.setNome("Guigao");
        System.out.println(carro1.COMPRADOR1);
    }
}
