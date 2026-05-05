package academy.devdojo.maratonajava.introducao.exercicios_arrays;

public class Exercicio3 {

    static void main(String[] args) {
        String[] livros = {"O Alquimista", "Dom Casmurro", "1984", "Duna", "Sapiens", "Fundação", "O Hobbit", "Neuromancer", "Dom Quixote"};

        for (String livro : livros){
            if(livro.contains("D") || livro.contains("O")) {          // ou .startsWith()
                System.out.println(livro);
            }
        }
    }
}
