package academy.devdojo.maratonajava.javacore.Fassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = sc.nextLine();

        if(pergunta.charAt(0) == ' '){
            System.out.println("sim");
        } else {
            System.out.println("não");
        }



        sc.close();
    }
}
