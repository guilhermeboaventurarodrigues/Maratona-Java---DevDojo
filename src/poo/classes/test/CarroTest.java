package poo.classes.test;

import poo.classes.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.name = "Golf";
        carro1.model = "Wolksvagen";
        carro1.year = 2012;

        carro2.name = "A1";
        carro2.model = "Audi";
        carro2.year = 2015;

        carro2 = carro1;

        System.out.println(carro1.name + " "  + carro1.model +" " +carro1.year);
        System.out.println(carro2.name + " "  + carro2.model +" "+carro2.year);
    }
}
