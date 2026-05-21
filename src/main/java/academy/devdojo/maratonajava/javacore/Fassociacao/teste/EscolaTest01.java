package academy.devdojo.maratonajava.javacore.Fassociacao.teste;

import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Fassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {

        Professor fernando = new Professor("Fernando");
        Professor maria = new Professor("Maria Cristina");
        Professor katusia = new Professor("Katusia");
        //Professor[] professores = {fernando, maria, katusia};
        /*
        Professor[] professores = new Professor[3];
        professores[0] = maria;
        professores[1] = fernando;
        professores[2] = katusia;

         */
        Professor[] professores = new Professor[]{fernando, maria, katusia};
        Escola escola = new Escola("Alub", professores);


        escola.imprime();
    }
}
