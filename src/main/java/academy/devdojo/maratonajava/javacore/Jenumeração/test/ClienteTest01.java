package academy.devdojo.maratonajava.javacore.Jenumeração.test;

import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.TipoPagamento;


public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente = new Cliente("Francisco", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente1 = new Cliente("Giulia", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("John Doe", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");

        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipocliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipocliente1);


    }
}
