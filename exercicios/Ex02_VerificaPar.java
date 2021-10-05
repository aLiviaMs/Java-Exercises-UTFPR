package exercicios;

import java.util.Scanner;

public class Ex02_VerificaPar {
    public static void main(String[] args) {
        verificaPar();
    }

    private static void verificaPar() {
        Scanner scn = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número. ");
        numero = scn.nextInt();

        if (numero % 2 != 0)
            System.out.println("Número Ímpar");
        else
            System.out.println("Número Par");

        System.out.println("\n Tchau");
        System.exit(0);
    }
}