package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula04EntradaDados {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        double brabow;
        String nome;

        number = sc.nextInt();
        brabow = sc.nextDouble();
        nome = sc.next();

        System.out.println(number);
        System.out.println(brabow);
        System.out.println(nome);


        sc.close();
    }
}
