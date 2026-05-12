package academy.devdojo.maratonajava.javacore.Emodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Emodificadorestatico.dominio.Carro;

public class CarroTest01 {

    static void main(String[] args) {
         Carro carro = new Carro("BMW", 300.0 );
        Carro carro2 = new Carro("Mercedes", 320.0 );
        Carro carro3 = new Carro("Audi", 340.0);

        Carro.setVelocidadeLimite(180);

       carro.imprimeCarro();


       carro2.imprimeCarro();

       carro3.imprimeCarro();
    }

}
