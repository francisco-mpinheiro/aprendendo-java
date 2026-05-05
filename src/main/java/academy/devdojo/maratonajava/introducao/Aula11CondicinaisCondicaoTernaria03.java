package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;
import java.util.Scanner;

public class Aula11CondicinaisCondicaoTernaria03 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        String maiorIdade = (idade >= 18) ? "Vc é maior de idade" : "Vc é menor de idade";

        System.out.println(maiorIdade);
    }
}
