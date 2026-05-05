package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimePiloto;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Piloto;

public class PilotoTest01 {

    static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();
        ImprimePiloto imprime = new ImprimePiloto();

        piloto1.nome = "Lewis Hamilton";
        piloto1.escuderia = "Ferrari";
        piloto1.idade = 40;

        piloto2.nome = "Max Verstappen";
        piloto2.idade = 28;
        piloto2.escuderia = "Red Bull";

       piloto1.mostrarPilto();



    }
}
