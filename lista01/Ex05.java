package lista01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a, b, c, delta, soma, sub;

        System.out.println("Digite, respectivamente, os valores de a, b e c:");
        a = scn.nextFloat();
        b = scn.nextFloat();
        c = scn.nextFloat();

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            soma = (float) ((-b + Math.sqrt(delta)) / (2 * a));

            sub = (float) ((-b - Math.sqrt(delta)) / (2 * a));

            System.out.println("\n Valor das raizes: " + soma + " e: " + sub);
        } else {
            System.out.println("Não e possivel calcular esta Raiz, não e um numero real ");
        }

    }

}
