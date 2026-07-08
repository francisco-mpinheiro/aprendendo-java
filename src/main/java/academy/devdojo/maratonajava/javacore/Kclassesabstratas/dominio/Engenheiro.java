package academy.devdojo.maratonajava.javacore.Kclassesabstratas.dominio;

public class Engenheiro extends Funcionario{
    public Engenheiro(String nome, double salario){
        super(nome, salario);
    }


    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.1;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Imprimindo Engenheiro");
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                "} " + super.toString();
    }
}
