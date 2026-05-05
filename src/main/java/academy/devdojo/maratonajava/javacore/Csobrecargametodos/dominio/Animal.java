package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Animal {
    private String nome;
    private String raca;
    private String sexo;
    private String cor;

    public Animal(String nome, String raca, String sexo) {
        this();
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
    }

    public Animal(String nome, String raca, String sexo, String cor){
        this(nome, raca, sexo);
        this.cor = cor;
    }

    public Animal(){
        System.out.println("Construtor vázio");
    }





    public void imprime(String nome, String raca){
        System.out.println(nome);
        System.out.println(raca);
    }

    public void imprime(String nome, String raca, String sexo){
        System.out.println(nome);
        System.out.println(raca);
        System.out.println(sexo);
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getSexo(){
        return sexo;
    }


}