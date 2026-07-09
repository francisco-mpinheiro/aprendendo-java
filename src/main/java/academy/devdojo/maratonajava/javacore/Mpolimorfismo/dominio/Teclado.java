package academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio;

public class Teclado extends Produto{
    public final double IMPOSTO_POR_CENTO = 0.05;
    public Teclado(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTributo() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
