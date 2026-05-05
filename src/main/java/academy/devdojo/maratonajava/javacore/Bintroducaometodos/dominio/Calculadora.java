package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {

    public void somarNumeros(){
        System.out.println(5+5);
    }

    public void subtrairNumeros(){
        System.out.println(20 - 2);
    }

    public void multiplicarNumeros(int a, int b){

        int multiplicacao = a * b;
        System.out.println(multiplicacao);
    }


    public int dobrarNumeros(int x, int y){
        int calculo = x * y;
        return calculo;
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }
        System.out.println("Não existe divisão por zero");
        return 0;

    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return; // aqui ele serve como um break
        } else {
            System.out.println(num1 / num2);
        };


    }



    public int dividePraConquistar(double num1, double num2) {
        return (int) (num1 / num2);
    }


    public String saudacao(String nome){
        return "Seja bem vindo " + nome;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 =99;
        num2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void capturandoDados(String nome){
        Scanner sc = new Scanner(System.in);
        String nomeAntigo = nome;
        System.out.print("Digite seu nome nome ");
        nome = sc.nextLine();

        System.out.println("mudando seu de " + nomeAntigo + " nome para " + nome);

        sc.close();
    }


    public void somaArray(int[] numeros){
        int soma = 0;

        for(int num: numeros){
            soma += num;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(String nome ,int... numeros){
        int soma = 0;

        for(int num: numeros){
            soma += num;
        }

        System.out.println(soma);
    }






}
