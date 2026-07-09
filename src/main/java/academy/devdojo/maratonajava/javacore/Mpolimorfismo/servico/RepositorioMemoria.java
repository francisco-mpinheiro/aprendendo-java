package academy.devdojo.maratonajava.javacore.Mpolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Mpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
