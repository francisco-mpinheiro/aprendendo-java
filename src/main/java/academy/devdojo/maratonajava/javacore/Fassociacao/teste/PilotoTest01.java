package academy.devdojo.maratonajava.javacore.Fassociacao.teste;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Escuderia;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Piloto;

import java.util.Scanner;

public class PilotoTest01 {
    static void main(String[] args) {
        String nome1, nome2;
        Scanner sc = new Scanner(System.in);
        Piloto piloto1 = new Piloto("");
        Piloto piloto2 = new Piloto("");
        Escuderia ferrari = new Escuderia("Ferrari");
        Piloto[] pilotos = {piloto1, piloto2};

        ferrari.setPilotos(pilotos);

        System.out.print("Digite o nome do primeiro piloto: ");
        nome1 = sc.nextLine();
        System.out.print("Digite o nome do segundo piloto: ");
        nome2 = sc.nextLine();

        piloto1.setNome(nome1);
        piloto2.setNome(nome2);

        ferrari.imprime();


        sc.close();
    }
}
