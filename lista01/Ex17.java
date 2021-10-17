package lista01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int vetor1[], vetor2[], valor;

        vetor1 = new int[15];
        vetor2 = new int[15];

        Arrays.sort(vetor2);

        for (int i = 0; i < 15; i++) {
            valor = scn.nextInt();

            vetor1[i] = valor;

            vetor2[i] = vetor1[i];
        }

        System.out.println("\n Vetor B");
        System.out.print("[");
        for (int i = vetor2.length - 1; i >= 0; i--) {
            if (vetor2[i] % 2 == 0) {
                System.out.print(vetor2[i] + ", ");
            }
        }
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] % 2 != 0) {
                if (i < 14) {
                    System.out.print(vetor2[i] + ", ");
                } else {
                    System.out.print(vetor2[i]);
                }
            }
        }
        System.out.print("] \n");
    }

}
