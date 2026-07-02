package academy.devdojo.maratonajava.javacore.Jenumeração.dominio;

public enum Setor {
    TI(1),
    RH(2),
    FINANCEIRO(3),
    SEGURANCA(4);


    private int valorSetor;

     Setor(int valorSetor){
        this.valorSetor = valorSetor;
    }

    public int getValorSetor() {
        return valorSetor;
    }
}
