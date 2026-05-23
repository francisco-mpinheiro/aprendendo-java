package academy.devdojo.maratonajava.javacore.Gheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("Dentro do bloco inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcario 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro de  construtor Funcionario ");

    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }


    public void relatorioPagamento(){
        IO.println("Eu" + this.nome + "recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
