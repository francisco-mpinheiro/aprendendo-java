package academy.devdojo.maratonajava.javacore.Jenumeração.test;

import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.PerfilUser;
import academy.devdojo.maratonajava.javacore.Jenumeração.dominio.User;

public class UserTest01 {
    static void main(String[] args) {
        User user = new User("Francisco", PerfilUser.MOD);


        System.out.println(PerfilUser.MOD.mostrarPapel("Você é moderador"));
    }
}
