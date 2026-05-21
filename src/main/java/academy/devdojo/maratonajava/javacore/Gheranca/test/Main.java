package academy.devdojo.maratonajava.javacore.Gheranca.test;

import academy.devdojo.maratonajava.javacore.Gheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Gheranca.dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.Gheranca.dominio.Endereco;

public class Main {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 10");
        endereco.setCep("73187198");

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("32132112311");

        pessoa.setEndereco(endereco);

       // pessoa.imprime();

        Endereco endereco2 = new Endereco();
        endereco2.setCep("43254234");
        endereco2.setRua("Avenida C");

        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("444.444.444-44");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(20000);
        funcionario.imprime();


    }
}
