package poo.metodos.test;

import poo.metodos.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.setNome("Guiga");
        estudante1.setIdade(12);
        estudante1.setSexo('F');

        estudante2.setNome("Aline");
        estudante2.setIdade(23);
        estudante2.setSexo('M');

        estudante2.imprime();
        estudante1.imprime();
    }
}
