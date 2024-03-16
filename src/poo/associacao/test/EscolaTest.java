package poo.associacao.test;

import poo.associacao.domain.Escola;
import poo.associacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Alberto");
        Professor professor2 = new Professor("Jorge");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Afonso Arinos", professores);
        escola.imprime();
    }
}
