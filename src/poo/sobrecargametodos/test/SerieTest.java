package poo.sobrecargametodos.test;

import poo.sobrecargametodos.domain.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie();

        serie.init("Prison Break", "TV", 67, 8);
        serie.imprime();
    }
}
