package academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio;

public class Videogame extends  Produto{
    public final double IMPOSTO_POR_CENTO = 0.25;
    public Videogame(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTributo() {
        return  this.valor * IMPOSTO_POR_CENTO;
    }
}
