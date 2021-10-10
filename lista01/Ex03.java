package lista01;

import java.util.Scanner;

public class Ex03 {

    // Terminar

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float salarioFixo, valorTotalDeVendasDoVendedor, valorCarro, salarioFinal, percentualVenda, bonus5PorCento;
        int quantidadeDeCarrosVendidos;

        System.out.println("Informe o valor do salário fixo: ");
        salarioFixo = scn.nextFloat();

        System.out.println("Informe a quantidade de carros vendidos: ");
        quantidadeDeCarrosVendidos = scn.nextInt();

        System.out.println("Informe o valor total das suas vendas no mês: ");
        valorTotalDeVendasDoVendedor = scn.nextFloat();

        valorCarro = valorTotalDeVendasDoVendedor / quantidadeDeCarrosVendidos;
        percentualVenda = (float) (valorCarro * 0.15) * quantidadeDeCarrosVendidos;
        bonus5PorCento = (float) (valorCarro * 0.05);

        salarioFinal = salarioFixo + percentualVenda + bonus5PorCento;

        System.out
                .println("O salário final é de: " + salarioFinal + "$ \nEste salário final consiste em: " + salarioFixo
                        + "$ de salário fixo. \nGanhando também um valor fixo por cada carro vendido no valor de: "
                        + percentualVenda + "$. \nE mais 5% do valor de vendas efetuadas, no valor de: "
                        + bonus5PorCento + "$.");

    }

}
