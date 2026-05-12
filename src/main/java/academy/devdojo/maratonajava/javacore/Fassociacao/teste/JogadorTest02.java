package academy.devdojo.maratonajava.javacore.Fassociacao.teste;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Time;

public class JogadorTest02 {

    static void main(String[] args) {
        Time time = new Time("Barcelona");
        Time time2 = new Time("Real Madrid");
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Cristiano Ronaldo");

        Jogador[] jogador = {jogador1, jogador2, jogador3};

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time2);

        jogador1.imprime();

        for(Jogador jogadores : jogador){
            jogadores.imprime();
        }
    }
}
