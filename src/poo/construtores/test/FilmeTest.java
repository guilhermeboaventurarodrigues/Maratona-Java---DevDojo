package poo.construtores.test;

import poo.construtores.domain.Filme;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme = new Filme("A procura de um resgate", "Ação", 2023, "Netflix");
        filme.imprime();
    }
}
