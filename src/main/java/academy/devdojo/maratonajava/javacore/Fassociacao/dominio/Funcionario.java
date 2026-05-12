package academy.devdojo.maratonajava.javacore.Fassociacao.dominio;

public class Funcionario {
    private String nome;
    private Setor setor;


    public void imprime(){
        System.out.println(this.nome);
        if(setor != null){
            System.out.println(setor.getNome());
        }
    }


    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
