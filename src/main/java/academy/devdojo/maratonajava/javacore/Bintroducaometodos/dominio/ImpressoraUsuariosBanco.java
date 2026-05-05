package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraUsuariosBanco {

    public void imprimeDados(UsuarioConta usuarioConta){
        System.out.println(usuarioConta.nome);
        System.out.println(usuarioConta.cpf);
        System.out.println(usuarioConta.numeroConta);
        System.out.println(usuarioConta.saldo);
    }

}
