package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.main;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio.Funcionario;

import java.util.Locale;

public class FuncionarioMain {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Francisco");
        funcionario.setIdade(21);
        funcionario.setSalario(new double[]{1.750, 2.550, 1.240});


        funcionario.mostrarDados();

        funcionario.mediaSalarial(funcionario.getSalario());


    }
}
