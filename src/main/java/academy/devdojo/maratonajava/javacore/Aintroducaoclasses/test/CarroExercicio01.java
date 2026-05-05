package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio01 {

    static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Polo";
        carro.modelo = "Hatch";
        carro.ano = 2023;

        carro1.nome = "C300";
        carro1.modelo = "Sedan";
        carro1.ano = 2019;

        carro1 = carro;

        System.out.println(carro.toString());
        System.out.println("--------------------");
        System.out.println(carro1.toString());
    }
}
