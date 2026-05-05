package academy.devdojo.maratonajava.introducao;

import java.util.Locale;

public class Aula02SaidaDeDados {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String nome = "Francisco";

        double altura = 1.85;

        int idade = 21;

        System.out.println("Seu nome é " + nome);
        System.out.printf("A sua altura é %.2f%n", altura);
        System.out.printf("Você tem %d anos", idade);

        System.out.println();

        System.out.println("Outra forma de formatar texto");
        System.out.printf("Seu nome é %s%n", nome);
        System.out.printf("Sua altura é de %.2f%n", altura);
        System.out.printf("Você tem %d anos", idade);

        System.out.print("Print sem quebrar linha");
    }
}
