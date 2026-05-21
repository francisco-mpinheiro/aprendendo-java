package academy.devdojo.maratonajava.javacore.Exercicios.associacao.main;

import academy.devdojo.maratonajava.javacore.Exercicios.associacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Exercicios.associacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Exercicios.associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Exercicios.associacao.dominio.Seminario;

public class Main {
    static void main(String[] args) {
        Local local = new Local("Sala AV56");
        Local local1 = new Local("Auditorio");
        Seminario seminario = new Seminario("Oficina de programação", local);
        Seminario seminario1 = new Seminario("Arquitetura Distriibuida", local1);
        Professor professor1 = new Professor("Barbosa", "Python");

        Aluno aluno1 = new Aluno("Francisco", 21, seminario);
        Aluno aluno2 = new Aluno("Giulia", 23, seminario);
        Aluno aluno3  = new Aluno("Fabricio", 21);

        Seminario[] seminarios = {seminario, seminario1};
        Aluno[] alunos = {aluno1, aluno2};

        professor1.imprime();

        professor1.setSeminarios(seminarios);
        seminario.setAlunos(alunos);

        System.out.println("---------------");
        System.out.println("Seminario");
        System.out.println();
        seminario.imprime();
        System.out.println();

        System.out.println("--------------");
        System.out.println("Professor");
        System.out.println();
        professor1.imprime();
        System.out.println();

        System.out.println("-------------------");
        System.out.println("Aluno");
        System.out.println();
        aluno1.imprime();
        System.out.println();
    }
}
