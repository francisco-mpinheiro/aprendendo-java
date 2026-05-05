package academy.devdojo.maratonajava.introducao.exercicios_arrays;

import java.util.Locale;

public class Exercicio05 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double[][] notas = new double[4][3];

        notas[0][0] = 10.0;
        notas[0][1] = 6.0;
        notas[0][2] = 3.0;

        notas[1][0] = 3.0;
        notas[1][1] = 4.0;
        notas[1][2] = 5.0;

        notas[2][0] = 6.0;
        notas[2][1] = 5.0;
        notas[2][2] = 10.0;

        notas[3][0] = 9.0;
        notas[3][1] = 7.0;
        notas[3][2] = 10.0;


        for (int i = 0; i < notas.length ; i++) {

            double somaNotasAluno = 0;
            System.out.println("\n------");
            for (int j = 0; j < notas[i].length ; j++) {

                somaNotasAluno += notas[i][j];


            }

            double mediaAluno = somaNotasAluno / notas[i].length;

            double[] media = {mediaAluno};

          for (double boletim : media){
              if(boletim >= 7.0){
                  System.out.printf("Aluno aprovado com: %.2f", boletim);
              } else {
                  System.out.printf("Aluno reprovado com: %.2f", boletim);
              }
          }
        }



        }

    }

