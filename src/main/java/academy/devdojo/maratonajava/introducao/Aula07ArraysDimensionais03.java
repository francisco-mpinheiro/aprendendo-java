package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysDimensionais03 {

    static void main() {
        int[] array = {1, 2};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = array;
        arrayInt[1] = new int[]{3, 4, 5, 6, 7};
        arrayInt[2] = new int[]{8, 9, 10, 11, 12, 13};


        for (int[] arrBase : arrayInt) {
            System.out.println("\n----");
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Short hand array");
        int[][] arrayInt2 = {{1, 2}, {1,2,3,4},{1,2,3,4,5,6,7,8}};

        for (int[] arrBase2 : arrayInt2){
            System.out.println("\n-------");
            for(int num : arrBase2){
                System.out.print(num);
            }
        }

    }


}
