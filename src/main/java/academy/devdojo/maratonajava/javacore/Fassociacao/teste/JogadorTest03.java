package academy.devdojo.maratonajava.javacore.Fassociacao.teste;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador dembele = new Jogador("Ousmane Dembele");
        Jogador neymar = new Jogador("Neymar");
        Jogador kvicha = new Jogador("Khvicha Kvaratskhelia");
        Jogador mbappe = new Jogador("Kylian Mbappe");
        Jogador[] jogadores = {dembele, neymar, mbappe, kvicha};

        Time psg = new Time("Psg", jogadores);
        Time real = new Time("Real Madrid");
        real.setJogador(mbappe);
        /*
        psg.imprime();
        System.out.println();
        System.out.println();
        System.out.println();
        mbappe.imprime();
        mbappe.setTime(psg);
        mbappe.imprime();
        */
        System.out.println("------Time--------");
        System.out.println();
        real.imprime();
        System.out.println();
        System.out.println("------Jogador------");
        System.out.println();
        mbappe.imprime();
    }
}
