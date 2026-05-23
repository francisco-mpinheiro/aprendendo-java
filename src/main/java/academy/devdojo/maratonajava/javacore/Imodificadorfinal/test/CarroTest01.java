package academy.devdojo.maratonajava.javacore.Imodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Imodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Imodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Imodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Francisco");

        System.out.println(carro.COMPRADOR);
        System.out.println(carro.COMPRADOR.getNome());
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
