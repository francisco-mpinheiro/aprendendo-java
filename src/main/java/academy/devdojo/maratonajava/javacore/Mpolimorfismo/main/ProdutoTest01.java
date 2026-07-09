package academy.devdojo.maratonajava.javacore.Mpolimorfismo.main;

import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Teclado;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Videogame;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.servico.CalculadoraImposta;

import java.util.Locale;

public class ProdutoTest01 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Produto produto = new Computador("Lenovo", 3000);
        CalculadoraImposta.calcularImpostoProduto(produto);

        System.out.println();
        System.out.println("---------------");

        Produto produto2 = new Videogame("Xbox Series S", 2000);
        CalculadoraImposta.calcularImpostoProduto(produto2);

        System.out.println();
        System.out.println("---------------");

        Produto produto3 = new Teclado("Blackwindow", 2000);
        CalculadoraImposta.calcularImpostoProduto(produto3);
    }


}
