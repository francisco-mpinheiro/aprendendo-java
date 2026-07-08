package academy.devdojo.maratonajava.javacore.Mpolimorfismo.main;

import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Videogame;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.servico.CalculadoraImposta;

import java.util.Locale;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Videogame videogame = new Videogame("PS5", 3.300);
        Computador computador = new Computador("PC gamer", 5.450);



        CalculadoraImposta.calcularImpostoComputador(computador);
        System.out.println();
        System.out.println("----------------");
        CalculadoraImposta.calcularImpostoVideogame(videogame);
    }
}
