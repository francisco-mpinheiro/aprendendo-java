package academy.devdojo.maratonajava.introducao;

import java.util.Locale;
import java.util.Scanner;

public class exercicios_nelio_alves {


    static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double planoBasico = 50.00;
        double extra = 2.00;


        int quantiaHoras = sc.nextInt();


        if(quantiaHoras <= 100){
            System.out.println("Valor a pagar: R$" + planoBasico);
        } else {

            int excedente = quantiaHoras - 100;

            extra *= excedente;
            planoBasico += extra;
            System.out.println("Valor a pagar: R$" + planoBasico);

        }





        sc.close();
    }
}
