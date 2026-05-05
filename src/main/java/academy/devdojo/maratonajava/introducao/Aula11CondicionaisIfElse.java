package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula11CondicionaisIfElse {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();

        if(nome.contains("F")){
            System.out.println("Vc é o chefe");
        } else {
            System.out.println("Vc não é o chefe");
        }


        sc.close();
    }
}
