package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Veiculo {
    private String modelo;
    private String tipo;
    private int anoFabricacao;
    private int quantiadePassageiros;

    public void imprime(){
        System.out.println(this.modelo);
        System.out.println(this.tipo);
        System.out.println(this.anoFabricacao);
        System.out.println(this.quantiadePassageiros);
    }

    public void adicionarAtributos(String modelo, String tipo, int anoFabricacao){
        this.modelo = modelo;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
    }

    public void adicionarAtributos(String modelo, String tipo, int anoFabricacao, int quantiadePassageiros){
        this.adicionarAtributos(modelo, tipo, anoFabricacao);
        this.quantiadePassageiros = quantiadePassageiros;
    }



    public String getTipo(){
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public int getQuantiadePassageiros() {
        return quantiadePassageiros;
    }

    public void setQuantiadePassageiros(int quantiadePassageiros) {
        this.quantiadePassageiros = quantiadePassageiros;
    }


}
