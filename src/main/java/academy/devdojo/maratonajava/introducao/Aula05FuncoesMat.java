package academy.devdojo.maratonajava.introducao;

public class Aula05FuncoesMat {

    static void main() {
        double a = 16;

        int x = 2;
        int y = 3;
        int absolute = -5;

        double calculo;

        calculo = Math.sqrt(a); // calcula a raiz quadrada do valor a

        System.out.println(calculo);

        calculo = Math.pow(x, y); // calcula a variavel x elevaod a y

        System.out.println(calculo);

        calculo = Math.abs(absolute); // recebe o valor absoluto de absolute

        System.out.println(calculo);
    }
}
