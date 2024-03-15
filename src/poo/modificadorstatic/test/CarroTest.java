package poo.modificadorstatic.test;

import poo.modificadorstatic.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Corola", 234);
        Carro c2 = new Carro("Audi", 189);
        Carro c3 = new Carro("BMW", 200);

        Carro.setVelocidadeLimite(20000);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
