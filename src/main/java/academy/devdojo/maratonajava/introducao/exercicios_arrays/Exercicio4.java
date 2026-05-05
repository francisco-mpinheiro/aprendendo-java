package academy.devdojo.maratonajava.introducao.exercicios_arrays;

public class Exercicio4 {

    static void main(String[] args) {

        int[][] filiais = new int[3][4];

        filiais[0][0] = 1;
        filiais[0][1] = 2;
        filiais[0][2] = 3;
        filiais[0][3] = 4;

        filiais[1][0] = 1;
        filiais[1][1] = 2;
        filiais[1][2] = 3;
        filiais[1][3] = 4;

        filiais[2][0] = 1;
        filiais[2][1] = 2;
        filiais[2][2] = 3;
        filiais[2][3] = 1;

        for (int i = 0; i < filiais.length; i++) {
            int somaTotal = 0;
            ;
            for (int j = 0; j < filiais[i].length; j++) {

                somaTotal += filiais[i][j];

            }

            System.out.println(somaTotal);
        }

    }
}
