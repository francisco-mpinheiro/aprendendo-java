package academy.devdojo.maratonajava.javacore.Emodificadorestatico.dominio;

public class Pessoa {
    public String nome;
    public static String rg;


    public void mostrarDados(){
        System.out.println(this.nome);
        System.out.println(rg);
    }

    public static void  mostrarDadosNovamente(){
        System.out.println(Pessoa.rg);
    }



}

