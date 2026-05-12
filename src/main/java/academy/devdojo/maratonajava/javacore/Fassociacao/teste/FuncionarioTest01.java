package academy.devdojo.maratonajava.javacore.Fassociacao.teste;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Setor;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Setor rh = new Setor("RH");
        Setor financeiro = new Setor("Financeiro");
        Setor producao = new Setor("Produção");

        Funcionario funcionario1 = new Funcionario("Chico");
        Funcionario funcionario2 = new Funcionario("Giulia");
        Funcionario funcionario3 = new Funcionario("Luiz");

        funcionario1.setSetor(rh);
       // System.out.println(funcionario1.getSetor());
         funcionario1.imprime();

    }
}
