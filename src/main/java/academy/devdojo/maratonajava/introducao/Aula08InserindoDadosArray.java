package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula08InserindoDadosArray {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int numero = 10;

        for (int i = 0; i < numero; i++) {
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();

            String[] usuarios = {nome};

            for (int j = 0; j < usuarios.length; j++) {
                System.out.println(j + ": " + usuarios[j]);
            }

        }












        sc.close();
    }
}
