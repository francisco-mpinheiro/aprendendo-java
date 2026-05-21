package academy.devdojo.maratonajava.javacore.Fassociacao.teste;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Time;

public class JogadorTest04 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        time.imprime();


        jogador.imprime();

    }
}
