package academy.devdojo.maratonajava.javacore.Mpolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Videogame;

public class CalculadoraImposta {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularTributo();
        System.out.println("computador " + computador.getNome());
        System.out.printf("Valor %.3f", computador.getValor());
        System.out.println();
        System.out.printf("Imposto %.3f", imposto);
    }

    public static void calcularImpostoVideogame(Videogame videogame){
        System.out.println("Relatório de imposto do computador");
        double imposto = videogame.calcularTributo();
        System.out.println("videogame " + videogame.getNome());
        System.out.printf("Valor %.3f", videogame.getValor());
        System.out.println();
        System.out.printf("imposto %.3f ", imposto);
    }

}
