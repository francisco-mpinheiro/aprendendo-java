package academy.devdojo.maratonajava.javacore.Dblocodeinicializacao.dominio;

public class Pessoa {
    private String nome;
    private double[] salarios;

    {
        this.salarios = new double[100];

        for (int i = 0; i < this.salarios.length ; i++) {
            salarios[i] = i+1;
        }
        for(double salario : this.salarios){
            System.out.print(salario + " ");
        }
    }

    public Pessoa(String nome) {

        this.nome = nome;
    }



    public Pessoa(){
        System.out.println("Dentro do método construtor");

        this.salarios = new double[100];

        for (int i = 0; i < this.salarios.length ; i++) {
            salarios[i] = i+1;
        }
        for(double salario : this.salarios){
            System.out.print(salario + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

}
