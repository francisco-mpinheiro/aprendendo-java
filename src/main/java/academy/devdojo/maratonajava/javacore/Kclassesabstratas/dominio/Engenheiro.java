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
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                "} " + super.toString();
    }
}
