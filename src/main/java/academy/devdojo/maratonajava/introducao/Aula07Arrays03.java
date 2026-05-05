package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {

    static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Francisco";
        nomes[1] = "Giulia";
        nomes[2] = "Fabricio";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.printf("%d: %s%n", i, nomes[i]);

        }
    }
}
