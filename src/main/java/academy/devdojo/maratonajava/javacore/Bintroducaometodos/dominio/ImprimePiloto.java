package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimePiloto {

    public void mostrarPiloto(Piloto piloto){

        System.out.println("Nome: " + piloto.nome + "\n" + "Escuderia: " + piloto.escuderia + "\n" + "idade: " + piloto.idade);

        piloto.nome = "Ayrton Senna";
    }

}
