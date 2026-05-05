package academy.devdojo.maratonajava.introducao;

public class Aula10ArraysMultiDim {

    public static void main(String[] args){
        String[][] nomes = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones", "Frank"}
        };

        // Mr. Smith
        IO.println(nomes[0][0] + nomes[1][2]);
        // Ms. Jones
        IO.println(nomes[0][2] + nomes[1][1]);



        // Multidimensional arrays (2D array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        IO.println("3x3 Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                IO.print(matrix[i][j] + " ");
            }
            IO.println(); // New line after each row
        }
        // Try a different shaped matrix
        String[][] schedule = {
                {"Math", "Science", "English"},
                {"History", "Art", "PE"},
                {"Music", "Computer", "Study Hall"}
        };

        IO.println("");
        IO.println("Class Schedule:");
        String[] periods = {"Period 1", "Period 2", "Period 3"};
        for (int day = 0; day < schedule.length; day++) {
            IO.println("Day " + (day + 1) + ":");
            for (int period = 0; period < schedule[day].length; period++) {
                IO.println("  " + periods[period] + ": " + schedule[day][period]);
            }
        }
    }




}
