package academy.devdojo.maratonajava.introducao.exercicios_arrays;

import java.util.Arrays;

public class Exercicio2 {

    static void main(String[] args) {

        double[] pesos = new double[6];



        pesos[0] = 450.57;
        pesos[1] = 512.01;
        pesos[2] = 480.20;
        pesos[3] = 560.79;
        pesos[4] = 410.19;
        pesos[5] = 425.20;

        double max = pesos[0];
        double min = pesos[0];

        for (double peso : pesos){

            if( peso > max) max = peso;
            if(peso < min) min = peso;

        }

        System.out.printf("O animal mais pesado pesa: %.2f%n", max);
        System.out.printf("O animal menos pesado pesa: %.2f", min);






    }
}
