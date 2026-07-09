package academy.devdojo.maratonajava.javacore.Mpolimorfismo.main;

import academy.devdojo.maratonajava.javacore.Mpolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Mpolimorfismo.servico.RepositorioBancoDados;

public class RepositorioMain {
    static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
