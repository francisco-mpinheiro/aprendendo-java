package academy.devdojo.maratonajava.javacore.Mpolimorfismo.dominio;

public class Tomate extends  Produto{
    private String dataValidade;

    public static double IMPOSTO_POR_CENTO = 0.03;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTributo() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
