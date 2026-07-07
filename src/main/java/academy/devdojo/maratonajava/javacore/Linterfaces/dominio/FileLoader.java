package academy.devdojo.maratonajava.javacore.Linterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }

    @Override
    public void RemoverData() {
        System.out.println("Removendo dados do arquivo");
    }

    @Override
    public void checkPermisson() {
        System.out.println("Checando permissões dentro do arquivo");
    }
}
