package academy.devdojo.maratonajava.introducao.exercicos;

import academy.devdojo.maratonajava.introducao.exercicos.domain.BancoDeDados;
import academy.devdojo.maratonajava.introducao.exercicos.domain.Pessoa;


import java.util.Scanner;

public class teste {
    static void main(String[] args) {
        int valor;
        int intervalo = 0;
        BancoDeDados dados = new BancoDeDados();
        Scanner sc = new Scanner(System.in);


        while(intervalo < 1000) {
            System.out.print("Digite {1} para cadastrar usuário, digite {2} visualizar usuários ou digite {3} para sair: ");
            valor = sc.nextInt();

            if (valor == 1) {
                String nome;
                String cpf;

                System.out.print("Digite o nome do usuário: ");
                nome = sc.next();
                System.out.print("Digite o cpf do usuário: ");
                cpf = sc.next();

                Pessoa pessoa = new Pessoa(nome, cpf);

                dados.armazenarUsuarios(pessoa);

                System.out.println("Usuário cadastrado com sucesso !");



            } else if (valor == 2) {
                dados.mostrarUsuarios();
            } else if (valor == 3) {
                System.out.println("Você saiu do sistema");
                return;
            }

        }++intervalo;

//        Pessoa pessoa1 = new Pessoa("Francisco", "777.777.777-77");
//        Pessoa pessoa2 = new Pessoa("Giulia", "888.888.888-77");
//
//
//
//        BancoDeDados dados = new BancoDeDados();
//        dados.armazenarUsuarios(pessoa1);
//        dados.armazenarUsuarios(pessoa2);
//
//        dados.mostrarUsuarios();

        sc.close();
    }
}
