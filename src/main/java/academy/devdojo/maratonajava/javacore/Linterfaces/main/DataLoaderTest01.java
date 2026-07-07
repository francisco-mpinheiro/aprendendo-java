package academy.devdojo.maratonajava.javacore.Linterfaces.main;

import academy.devdojo.maratonajava.javacore.Linterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Linterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Linterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader dataLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();


        dataLoader.load();
        System.out.println("--------------------");
        fileLoader.load();

        System.out.println("--------------------");
        dataLoader.RemoverData();
        dataLoader.checkPermisson();
        System.out.println("---------------------");
        fileLoader.checkPermisson();

        DataLoader.retrieveMaxDataSize();

        DatabaseLoader.retrieveMaxDataSize();
    }
}
