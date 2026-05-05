package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

import java.util.StringJoiner;

public class Funcionario {
    private Integer id;
    private String nome;
    private String setor;
    private int idade;
    private double salario;
    private String conveio;

    public Funcionario(Integer id, String nome, String setor, int idade, double salario){
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.idade = idade;
        this.salario = salario;
    }

    public Funcionario(Integer id, String nome, String setor, int idade, double salario, String conveio){
        System.out.println("Dentro do construtor sem argumentos");
        this(id, nome, setor, idade, salario );
        this.conveio = conveio;
    }



    public String toString(){
        return "ID: " + this.id + "\n" +
                "NOME: " + this.nome + "\n" +
                "SETOR: " + this.setor + "\n" +
                "IDADE: " + this.idade + "\n" +
                "SALARIO: " + this.salario + "\n";
    }
}
