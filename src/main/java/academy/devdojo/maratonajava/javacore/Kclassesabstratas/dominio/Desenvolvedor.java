package academy.devdojo.maratonajava.javacore.Kclassesabstratas.dominio;

public class Desenvolvedor  extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }



    @Override
    public void calcularBonus() {

    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "salario=" + salario +
                ", nome='" + nome;
    }
}
