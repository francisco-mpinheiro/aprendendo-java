package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salario;
    private double media;


    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.salario == null) {
            System.out.println("Salario não cadastrado");
            return;
        }
        for (int i = 0; i < salario.length; i++) {
            System.out.printf("O salario é :  R$ %.3f\n", this.salario[i]);
        }


    }

    public void mediaSalarial(double... salario) {
        if (this.salario == null) {
            return;
        }

        for (double sal : salario) {
            media += sal;
        }

        System.out.println();
        System.out.println();
        System.out.printf("A média salarial é: %.3f", media / salario.length);


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }


}
