package academy.devdojo.maratonajava.introducao.exercicios_arrays.classesObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cancela = 1;

        if(cancela == 1){
            return;
        }



        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite o CPF do funcionário: ");
        String cpf = sc.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = sc.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        Funcionario colaborador = new Funcionario(nome, cpf, cargo, salario);

        System.out.println();
        System.out.println("-----------------------");
        System.out.println();


        System.out.println(colaborador.toString());

        System.out.println();
        System.out.println("-----------------------");
        System.out.println();

        if(colaborador.getCargo().equals("Chefe")){
            System.out.println("Tem permissão");
        } else {
            System.out.println("Não tem acesso");
        }

        System.out.println();
        System.out.println("-----------------------");
        System.out.println();

        if(colaborador.getCargo() != "Chefe"){
            colaborador.setCargo("Chefe");

        }

        System.out.println(colaborador.getCargo());

        sc.close();

    }
}
