package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        Estudante student = estudante03;
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "Francisco";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Giulia";
        estudante02.idade = 14;
        estudante02.sexo = 'F';

        estudante03.nome = "teste";
        estudante03.idade = 14;
        estudante03.sexo = 'F';


        impressora.imprime(estudante01);
        System.out.println("--------------");
        impressora.imprime(estudante02);

        System.out.println(student.getClass());



    }
}
