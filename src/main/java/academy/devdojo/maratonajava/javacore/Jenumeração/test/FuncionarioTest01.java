package academy.devdojo.maratonajava.javacore.Jenumeração.test;

import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.Cargo;
import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Francisco", Cargo.DONO );

        System.out.println(funcionario);


        funcionario.setCargo(Cargo.COLABORADOR);


        System.out.println(funcionario);
    }
}
