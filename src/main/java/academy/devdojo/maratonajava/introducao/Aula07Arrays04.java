package academy.devdojo.maratonajava.introducao;

import java.util.Locale;

public class Aula07Arrays04 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int[] idade = {3, 7, 10};
        int[] numeros = new int[]{3, 7, 10};


        for (int i = 0; i < idade.length ; i++) {
            System.out.println(idade[0]);
        }

        double[] precos = {10.0, 11.5, 15.5};

        for(double preco : precos){
            System.out.printf("preco: %.2f%n", preco);
        }

    }
}
