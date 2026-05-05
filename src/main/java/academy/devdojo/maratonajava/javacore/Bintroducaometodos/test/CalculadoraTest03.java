package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;
        // calculadora.capturandoDados("Rodrigo");
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da CalculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);
    }
}
