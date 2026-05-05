package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Veiculo;

public class VeiculoTest01 {

    static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Veiculo aviao = new Veiculo();

        veiculo.setTipo("Carro");
        veiculo.setAnoFabricacao(2009);
        veiculo.setModelo("Volkswagen");

        veiculo.imprime();

        System.out.println("-------------------------");

        aviao.adicionarAtributos("AirBus", "Avião", 2010, 100);


        aviao.imprime();
    }
}
