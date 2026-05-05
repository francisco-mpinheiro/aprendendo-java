package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "Francisco", "TI", 21, 1.750, "UNIMED");

        System.out.println(funcionario.toString());

    }
}
