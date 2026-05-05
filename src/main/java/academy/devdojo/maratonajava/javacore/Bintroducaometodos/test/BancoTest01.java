package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.DepositoConta;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraUsuariosBanco;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.UsuarioConta;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BancoTest01 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UsuarioConta conta1 = new UsuarioConta();
        DepositoConta deposito = new DepositoConta();
        ImpressoraUsuariosBanco imprime = new ImpressoraUsuariosBanco();



        conta1.nome = "Francisco";
        conta1.cpf = "111.111.111-11";
        conta1.numeroConta = 101;
        conta1.saldo = 100;


        imprime.imprimeDados(conta1);

        System.out.print("Digite o valor que você deseja depositar: ");
        double valorParaDepositar = sc.nextDouble();

        System.out.println("---------------------");
        deposito.depositoDinheiroConta(conta1, valorParaDepositar);

        imprime.imprimeDados(conta1);





    }
}
