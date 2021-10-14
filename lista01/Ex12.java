package lista01;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int valor, valorInicial, nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;

        System.out.println("Digite o valor a ser pago. ");

        valor = scn.nextInt();

        valorInicial = valor;

        while (valor != 0) {
            if (valor >= 100) {
                nota100 = valor / 100;

                valor = valor % 100;
            } else if (valor >= 50 && valor < 100) {
                nota50 = valor / 50;

                valor = valor % 50;
            } else if (valor >= 20 && valor < 50) {
                nota20 = valor / 20;

                valor = valor % 20;
            } else if (valor >= 10 && valor < 20) {
                nota10 = valor / 10;

                valor = valor % 10;
            } else if (valor >= 5 && valor < 10) {
                nota5 = valor / 5;

                valor = valor % 5;
            } else if (valor >= 2 && valor < 5) {
                nota2 = valor / 2;

                valor = valor % 2;
            } else if (valor == 1) {
                nota1 = valor / 1;

                valor = valor % 1;
            }
        }

        System.out.print("Para pagar R$ " + valorInicial + " são necessárias ");

        if (nota100 > 0) {
            System.out.print(nota100 + " notas de 100 |");
        }
        if (nota50 > 0) {
            System.out.print(nota50 + " notas de 50 |");
        }
        if (nota20 > 0) {
            System.out.print(nota20 + " notas de 20 |");
        }
        if (nota10 > 0) {
            System.out.print(nota10 + " notas de 10 |");
        }
        if (nota5 > 0) {
            System.out.print(nota5 + " notas de 5 |");
        }
        if (nota2 > 0) {
            System.out.print(nota2 + " notas de 2 |");
        }
        if (nota1 > 0) {
            System.out.print(nota1 + " notas de 1 |");
        }

    }

}
