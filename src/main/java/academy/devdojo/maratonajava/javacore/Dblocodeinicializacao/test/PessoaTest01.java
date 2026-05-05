package academy.devdojo.maratonajava.javacore.Dblocodeinicializacao.test;

import academy.devdojo.maratonajava.javacore.Dblocodeinicializacao.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa);

        System.out.println("-----------------------");

        System.out.println(pessoa.getSalarios());
    }
}
