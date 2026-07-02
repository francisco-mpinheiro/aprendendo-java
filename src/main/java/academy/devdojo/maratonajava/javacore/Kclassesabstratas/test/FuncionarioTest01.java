package academy.devdojo.maratonajava.javacore.Kclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Kclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Kclassesabstratas.dominio.Engenheiro;
import academy.devdojo.maratonajava.javacore.Kclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Kclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {
      //  Funcionario funcionario = new Funcionario("Giulia", 3.500);
        Gerente gerente = new Gerente("Francisco", 5.550);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Giulia", 4.550);
        Engenheiro engenheiro = new Engenheiro("Carlos", 3.500);

      //  System.out.println(funcionario);
        System.out.println();
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        System.out.println(engenheiro);
    }
}
