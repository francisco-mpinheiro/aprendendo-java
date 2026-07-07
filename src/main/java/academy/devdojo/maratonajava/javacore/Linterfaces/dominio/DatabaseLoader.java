package academy.devdojo.maratonajava.javacore.Linterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void RemoverData() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermisson() {
        System.out.println("Checando permissão para o banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da retrieveMaxDataSize na classe");
    }
}
