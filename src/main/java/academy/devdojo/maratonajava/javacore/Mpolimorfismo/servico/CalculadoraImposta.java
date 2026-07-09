package academy.devdojo.maratonajava.javacore.Mpolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Videogame;

public class CalculadoraImposta {
    public static void calcularImpostoProduto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularTributo();
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Valor %.2f ", produto.getValor());
        System.out.println();
        System.out.printf("Imposto %.2f ", imposto);
        if(produto instanceof Tomate){
           // Tomate tomate = (Tomate) produto;
            System.out.println(((Tomate) produto).getDataValidade());
        }

    }



}
