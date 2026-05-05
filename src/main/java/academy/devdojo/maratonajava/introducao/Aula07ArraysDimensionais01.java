package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysDimensionais01 {

    static void main(String[] args) {
        String[][][] usuario = {
                {
                    {"Francisco"}, {"francisco@gmail.com"}, {"Estagiario"}, {"11"}
                },
                {
                    {"Giulia"}, {"giulia@gmail.com"}, {"Consultora"}, {"10"}
                },
                {
                    {"Fabricio"}, {"fabricio@gmail.com"}, {"Gestor"}, {"15"}
                }

        };

        System.out.println(usuario[0][0][0] + " | " +  usuario[0][1][0] + " | " + usuario[0][2][0]);
        System.out.println(usuario[1][0][0] + " | " + usuario[1][1][0] +  " | " + usuario[1][2][0]);
        System.out.println(usuario[2][0][0] + " | " + usuario[2][1][0] +  " | " + usuario[2][2][0]);

        System.out.println(usuario.length);
    }
}

