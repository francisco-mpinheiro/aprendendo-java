package academy.devdojo.maratonajava.introducao;

public class Aula09TiposDiferentesEmArrays {

    static void main(String[] args) {

        // Enhanced for loop (for-each)
        int[] scores = {95, 87, 92, 78, 85};
        IO.println("Test scores using enhanced for loop:");
        for (int score : scores) {
            IO.println("Score: " + score);
        }

        // Different data types
        double[] temperatures = {20.5, 25.0, 18.3, 30.2};
        boolean[] flags = {true, false, true, false, true};
        char[] letters = {'a', 'b', 'c', 'd', 'e'};

        IO.println("");
        IO.println("Temperatures:");
        for (double temp : temperatures) {
            IO.println(temp + "°C");
        }

        IO.println("");
        IO.println("Boolean flags:");
        for (int i = 0; i < flags.length; i++) {
            IO.println("Flag " + i + ": " + flags[i]);
        }

        IO.println("");
        IO.println("Character letters:");
        for (char letter : letters) {
            IO.println("Letter: " + letter);
        }
    }
}
