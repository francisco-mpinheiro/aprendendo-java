package academy.devdojo.maratonajava.javacore.Emodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;



    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprimeCarro(){
        System.out.println("---------------------");
        System.out.println("NOME: " + this.nome);
        System.out.println("VELOCIDADE MÁXIMA: " + this.velocidadeMaxima);
        System.out.println("VELOCIDADE LIMITE: " + Carro.velocidadeLimite);
    }



    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double  getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }





}
