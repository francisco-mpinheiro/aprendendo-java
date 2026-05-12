package academy.devdojo.maratonajava.javacore.Fassociacao.teste;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Cristiano Ronaldo");
        Jogador jogador3 = new Jogador("Messi");
        Jogador[] arrayJogadores = {jogador1, jogador2, jogador3};
        // PODE SER FEITO TAMBÉM
        // Jogador[] arrayJogadores = new Jogador[]{jogador1, jogador2, jogador3};
        // Jogador[] arrayJogadores = new Jogador[3];

        for(Jogador jogador : arrayJogadores){
            jogador.imprime();
        }




    }
}
