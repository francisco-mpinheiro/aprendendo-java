package academy.devdojo.maratonajava.javacore.Imodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Imodificadorfinal.dominio.Animal;
import academy.devdojo.maratonajava.javacore.Imodificadorfinal.dominio.Cachorro;

public class AnimalTest01 {
    static void main(String[] args) {
        Animal animal = new Animal();

        Cachorro cachorro = new Cachorro("Bolinha", 4, "Shih Tzu");

        cachorro.mostrar();
    }
}
