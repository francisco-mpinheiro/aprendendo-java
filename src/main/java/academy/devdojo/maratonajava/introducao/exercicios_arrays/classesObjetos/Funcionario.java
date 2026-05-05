package academy.devdojo.maratonajava.introducao.exercicios_arrays.classesObjetos;

public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;

    // MÉTODO CONSTRUTOR
    public Funcionario(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString(){
        return "Nome: " + this.nome + "\n" + "CPF: " + this.cpf + "\n" + "Cargo: " + this.cargo + "\n" + "Salário: " + this.salario;


    }
}
