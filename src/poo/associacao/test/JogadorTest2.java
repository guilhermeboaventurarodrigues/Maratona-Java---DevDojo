package poo.associacao.test;

import poo.associacao.domain.Jogador;
import poo.associacao.domain.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");

        Time time = new Time("Flamengo");

        Jogador jogador2 = new Jogador("Pelé");

        jogador1.setTime(time);
        jogador1.imprime();
        jogador2.setTime(time);
        jogador2.imprime();
    }
}
