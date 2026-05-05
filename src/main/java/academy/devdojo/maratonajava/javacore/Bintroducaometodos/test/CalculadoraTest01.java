package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora usuario = new Calculadora();

        calculadora.somarNumeros();
        calculadora.subtrairNumeros();

       int numeroCalculado = calculadora.dobrarNumeros(15, 2);

        System.out.println(numeroCalculado);



    }
}
