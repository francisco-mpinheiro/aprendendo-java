package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {

    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("Usando array como parametro: ");
        calculadora.somaArray(numeros);

        System.out.println("----------------");


        System.out.print("Usando varargs: ");
        calculadora.somaVarArgs("Nome", 2,4 , 8, 16, 32, 64, 128 , 256, 512, 1024);
    }
}
