package academy.devdojo.maratonajava.javacore.Jenumeração.test;

import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.TipoCliente;

public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente = new Cliente("Francisco", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente1 = new Cliente("Giulia", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("John Doe", TipoCliente.PESSOA_INVALIDA);
        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);

        if (cliente.getTipoCliente() == TipoCliente.PESSOA_FISICA) {
            System.out.println("Digite seu CPF:");
        } else if (cliente.getTipoCliente() == TipoCliente.PESSOA_JURIDICA) {
            System.out.println("Digite seu CNPJ:");
        }
    }
}
