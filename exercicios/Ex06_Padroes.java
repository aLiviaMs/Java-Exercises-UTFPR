package exercicios;

import java.util.Scanner;

public class Ex06_Padroes {

    public static void main(String[] args) {
        padroes();
    }

    private static void padroes() {
        Scanner scn = new Scanner(System.in);
        int n;

        System.out.println("Digite valora da váriavel N.");
        n = scn.nextInt();

        // 1
        for (int colunas = 0; colunas < n; colunas++) {
            for (int linhas = 0; linhas < n; linhas++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // 2
        for (int colunas = 1; colunas <= n; colunas++) {
            for (int linhas = 1; linhas <= colunas; linhas++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // 3
        for (int colunas = n; colunas >= 1; colunas--) {
            for (int linhas = 1; linhas <= n - colunas; linhas++) {
                System.out.print("  ");
            }
            for (int linhas = 1; linhas <= colunas; linhas++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

}