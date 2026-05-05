package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {

    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Calculadora usuario = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 0);

        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros(40, 2));



        System.out.println(calculadora.dividePraConquistar(20.0, 3.5));

        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("---------------------");

        calculadora.imprimeDivisaoDeDoisNumeros(20, 2);
        // MÉTODOS VOIDS NÃO PODEM SER PRINTADOS PELO SYSTEM.OUT
        // System.out.println(calculadora.imprimeDivisaoDeDoisNumeros(20, 2));


        System.out.println("################");

        System.out.println(usuario.saudacao("Francisco"));

    }
}
