package academy.devdojo.maratonajava.javacore.Fassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;


    public void imprime() {
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome());
        } else {
            System.out.println("Não tem time");
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
