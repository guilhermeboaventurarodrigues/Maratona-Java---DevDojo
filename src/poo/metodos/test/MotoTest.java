package poo.metodos.test;

import poo.metodos.domain.ImpressoraMoto;
import poo.metodos.domain.Moto;

public class MotoTest {
    public static void main(String[] args) {
        Moto moto = new Moto();
        ImpressoraMoto impressora = new ImpressoraMoto();

        moto.modelo = "Titan 160";
        moto.cc = "160CC";
        moto.ano = 2022;

        impressora.imprime(moto);
    }
}
