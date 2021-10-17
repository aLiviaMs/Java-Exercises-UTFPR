package lista01;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float X = 0, T = 0, M = 0, valorObtido = 0, valorMensal;
        int mes = 0;

        System.out.println("Digite o valor do depósito mensal.");
        X = scn.nextFloat();
        while (X <= 0) {
            System.out.println("O valor do depósito precisa ser maior que zero! \n");
            X = scn.nextFloat();
        }

        System.out.println("Digite o valor da taxa de remuneração. Em %: ");
        T = scn.nextFloat();

        System.out.println("Digite o valor total a economizar.");
        M = scn.nextFloat();

        System.out.println("\n");

        do {
            valorMensal = X + (X * (T / 100));

            mes++;
            System.out.println("Evolução mensal da aplicação, mês: " + mes);

            valorObtido += valorMensal;
            System.out.println("Evolução mensal da aplicação no valor de: " + valorObtido);
        } while (valorObtido < M);

        if (valorObtido >= M) {
            if (mes == 1) {
                System.out.println("Valor a economizar foi atingido. Em " + mes + " mês. ");
            } else {
                System.out.println("Valor a economizar foi atingido. Em " + mes + " meses. ");
            }

        }

    }

}
