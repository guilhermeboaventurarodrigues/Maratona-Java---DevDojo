package poo.associacao.test;

import poo.associacao.domain.Jogador;
import poo.associacao.domain.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Pelé");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time = new Time("Barcelona");

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        time.setJogadores(jogadores);

        time.imprime();
    }
}
