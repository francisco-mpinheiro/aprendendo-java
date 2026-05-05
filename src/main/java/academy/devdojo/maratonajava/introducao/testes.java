package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class testes {

    static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numeroLinhas;

    System.out.print("Digite o número de linhas que deseja pular: ");
    numeroLinhas = sc.nextInt();

    for(int i = 0; i < numeroLinhas; i++){
        System.out.println();
    }

        System.out.println("Vocé pulo " + numeroLinhas + " linhas ");




    sc.close();
















    }


}
