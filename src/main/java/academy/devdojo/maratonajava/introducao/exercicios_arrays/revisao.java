package academy.devdojo.maratonajava.introducao.exercicios_arrays;

public class revisao {

    static void main(String[] args) {

        int[][] number = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int[] arrBase : number){
        System.out.println("\n---");
           for (int num : arrBase){
               System.out.print(" " + num);
           }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

           // System.out.println(number[1][1]);


            for (int i = 0; i < number.length ; i++) {
                for (int j = 0; j < number[i].length ; j++) {
                    System.out.println(number[i][j]);
                }


                String[] nomes = {"Francisco", "Giulia", "Boto"};

                String[] copy = new String[3];

                System.arraycopy(nomes, 0, copy, 0, 3);
                for(String copia : copy){
                    System.out.println(copia);
                }


            }
        }



    }
}
