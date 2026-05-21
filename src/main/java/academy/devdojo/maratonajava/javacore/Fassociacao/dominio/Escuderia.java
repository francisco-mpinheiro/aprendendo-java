package academy.devdojo.maratonajava.javacore.Fassociacao.dominio;

public class Escuderia {
    private String nome;
    private Piloto[] pilotos;

    public Escuderia(String nome) {
        this.nome = nome;
    }

    public Escuderia(String nome, Piloto[] pilotos) {
        this.nome = nome;
        this.pilotos = pilotos;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(pilotos == null) return;
        for(Piloto piloto : pilotos){
            System.out.println(piloto.getNome());
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Piloto[] getPilotos() {
        return pilotos;
    }

    public void setPilotos(Piloto[] pilotos) {
        this.pilotos = pilotos;
    }
}
