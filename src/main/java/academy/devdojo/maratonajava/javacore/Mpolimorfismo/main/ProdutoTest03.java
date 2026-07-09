package academy.devdojo.maratonajava.javacore.Mpolimorfismo.main;

import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.servico.CalculadoraImposta;

public class ProdutoTest03 {
    static void main(String[] args) {
        Produto produto = new Computador("Macbook", 10000);

        Tomate tomate = new Tomate("Tomate cereja", 5);
        tomate.setDataValidade("03/08/2026");


        CalculadoraImposta.calcularImpostoProduto(produto);
    }
}
