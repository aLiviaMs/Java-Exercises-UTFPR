package lista01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float etanol = 4.69f, gasolina = 6.01f, diesel = 5.09f, desconto = 0, valorNormal = 0, valorDesconto = 0,
                valorFinal = 0, quantidadeCombustivel;
        String tipoCombustivel;

        System.out.println("Qual o tipo de combustível? Digite E para Etanol, G para Gasolina ou D para Diesel. ");
        tipoCombustivel = scn.nextLine();

        if (tipoCombustivel.equals("e") || tipoCombustivel.equals("E")) {
            System.out.println("Qual a quantidade de litros que será abastecido de Etanol? ");
            quantidadeCombustivel = scn.nextFloat();

            valorNormal = etanol * quantidadeCombustivel;

            if (quantidadeCombustivel > 30) {
                valorDesconto = (float) (valorNormal * 0.05);
                valorFinal = valorNormal - valorDesconto;
            } else {
                valorFinal = valorNormal;
            }
        } else if (tipoCombustivel.equals("g") || tipoCombustivel.equals("G")) {
            System.out.println("Qual a quantidade de litros que será abastecido de Gasolina? ");
            quantidadeCombustivel = scn.nextFloat();

            valorNormal = gasolina * quantidadeCombustivel;

            if (quantidadeCombustivel > 40) {
                valorDesconto = (float) (valorNormal * 0.05);
                valorFinal = valorNormal - valorDesconto;
            } else {
                valorFinal = valorNormal;
            }
        } else if (tipoCombustivel.equals("d") || tipoCombustivel.equals("D")) {
            System.out.println("Qual a quantidade de litros que será abastecido de Diesel? ");
            quantidadeCombustivel = scn.nextFloat();

            valorNormal = diesel * quantidadeCombustivel;

            if (quantidadeCombustivel > 80) {
                valorDesconto = (float) (valorNormal * 0.05);
                valorFinal = valorNormal - valorDesconto;
            } else {
                valorFinal = valorNormal;
            }
        } else {
            System.out.print("Combustível inválido");
            System.exit(0);
        }

        System.out.println(
                "O valor normal é de: " + valorNormal + "\nO desconto oferecido pela quantidade de combustível é de: "
                        + valorDesconto + "\nO valor final a ser pago é de: " + valorFinal);
    }
}
