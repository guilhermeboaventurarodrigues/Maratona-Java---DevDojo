package poo.associacao.test;

import poo.associacao.domain.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
