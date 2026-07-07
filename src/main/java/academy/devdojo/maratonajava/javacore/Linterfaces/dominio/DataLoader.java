package academy.devdojo.maratonajava.javacore.Linterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermisson(){
        System.out.println("Fazendo checagem de permissão");
    };

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da retrieveMaxDataSize na interface");
    }


}
