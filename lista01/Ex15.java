package lista01;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int linhas, n = 1;
        System.out.print("Digite o numero de linhas: ");

        linhas = scn.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   " + n);
                n++;
            }
            System.out.println();
        }

    }
}