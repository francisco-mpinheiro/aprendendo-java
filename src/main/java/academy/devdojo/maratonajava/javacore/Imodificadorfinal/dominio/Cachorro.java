package academy.devdojo.maratonajava.javacore.Imodificadorfinal.dominio;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int intQuantidadePatas, String raca) {
        this.nome = nome;
        this.intQuantidadePatas = intQuantidadePatas;
        this.raca = raca;
    }

    public void mostrar(){
        System.out.println(this.nome);
        System.out.println(this.raca);
        fazerSom("Au Au Au Au");
    }

}
