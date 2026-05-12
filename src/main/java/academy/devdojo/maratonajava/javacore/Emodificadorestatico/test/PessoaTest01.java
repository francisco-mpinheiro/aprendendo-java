package academy.devdojo.maratonajava.javacore.Emodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Emodificadorestatico.dominio.Pessoa;

public class PessoaTest01 {

    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Francisco";
        Pessoa.rg = "3665786";

      //  pessoa.mostrarDados();
        Pessoa.mostrarDadosNovamente();
    }
}
