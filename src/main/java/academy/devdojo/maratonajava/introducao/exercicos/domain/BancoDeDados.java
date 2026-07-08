package academy.devdojo.maratonajava.introducao.exercicos.domain;

public class BancoDeDados {
    Pessoa[] usuarios = new Pessoa[100];
    int proximaPosicao = 0;

    public void armazenarUsuarios(Pessoa pessoa){
         if(proximaPosicao < usuarios.length){
             usuarios[proximaPosicao] = pessoa;

             proximaPosicao++;
         }


    }

    public void mostrarUsuarios(){
        System.out.println("Todos os usuários cadastrados");
        System.out.println();
        System.out.println("--------------");
        System.out.println();
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null){
                System.out.println(usuarios[i].getNome());
            }
        }
    }



}
