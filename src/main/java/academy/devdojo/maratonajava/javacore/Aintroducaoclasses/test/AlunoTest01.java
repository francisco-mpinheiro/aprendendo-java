package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Aluno;

public class AlunoTest01 {

    static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Francisco";
        aluno.idade = 21;
        aluno.sexo = 'M';

        System.out.println(aluno.toString());
    }
}
