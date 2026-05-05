package academy.devdojo.maratonajava.introducao;

public class Aula06ArrayDemo {

    static void main(String[] args) {
        // declarando a array
        int [] anArray;

        // alocando o tamanho do array
        anArray = new int[10];

        //Adiconando os elementos no array
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        // imprimindo o primeiro indice da array
        System.out.println(anArray[0]);

        System.out.println(anArray[9]);

        //Imprimindo todo array

        for(int i = 0; i < anArray.length; i++){
            System.out.printf("O valor do indice %d é %d%n", i, anArray[i]);
        }


        //Criando um Array de forma mais simples
        String[] frutas = {"banana", "apple", "watermeloon", "pineapple"};
        IO.println();
        IO.println("Fruits Array");

        for(int i = 0; i < frutas.length; i++){
            System.out.println(i + ": " + frutas[i]);;
        }

        double[] precos = {99.0, 100.0, 9.99};

        for(int i = 0; i < precos.length; i++){
            System.out.println(i + ": " + precos[i]);
        }

    }
}
