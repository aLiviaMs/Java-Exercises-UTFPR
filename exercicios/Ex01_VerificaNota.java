package exercicios;

import java.util.Scanner;

public class Ex01_VerificaNota {
    public static void main(String[] args) {
        verificaNota();
    }

    private static void verificaNota() {

        Scanner scn = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota. ");
        nota = scn.nextInt();

        if (nota >= 6)
            System.out.print("Passou.");
        else
            System.out.print("Reprovou.");

        System.out.println("\n Pronto!");
        System.exit(0);
    }
}
