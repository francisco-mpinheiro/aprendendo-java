package academy.devdojo.maratonajava.introducao.exercicios_arrays;

import java.util.Arrays;
import java.util.Locale;

public class Exercicio1 {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double[] faturamento = {1500.50,750.67, 2341.10, 1300.40, 3600.0, 1290.0, 5000.70};
        double sum = 0.0;
        for (double fatura : faturamento){
            sum += fatura;
            System.out.println("O faturamento foi de: R$" + fatura);

        }

        double mediaFaturamento = (sum / faturamento.length);

        System.out.println("--------------------------------------");
        System.out.printf("O Faturamento semanal foi de: R$ %.2f%n" ,sum);
        System.out.printf("Média diaria de venda foi: R$ %.2f", mediaFaturamento);


    }
}
