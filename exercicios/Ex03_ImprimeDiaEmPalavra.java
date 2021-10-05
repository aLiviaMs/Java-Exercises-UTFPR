package exercicios;

import java.util.Scanner;

public class Ex03_ImprimeDiaEmPalavra {
    public static void main(String[] args) {
        ImprimeDiaEmPalavra();
    }

    private static void ImprimeDiaEmPalavra() {
        Scanner scn = new Scanner(System.in);

        int numero_dias;

        System.out.println("Digite o numero do dia. ");
        numero_dias = scn.nextInt();

        // (a) Uma instrução "if aninhado".

        if (numero_dias >= 0 && numero_dias <= 6) {
            if (numero_dias == 0)
                System.out.println("Domingo");
            if (numero_dias == 1)
                System.out.println("Segunda");
            if (numero_dias == 2)
                System.out.println("Terça");
            if (numero_dias == 3)
                System.out.println("Quarta");
            if (numero_dias == 4)
                System.out.println("Quinta");
            if (numero_dias == 5)
                System.out.println("Sexta");
            if (numero_dias == 6)
                System.out.println("Sábado");
        } else {
            System.out.println("Não é um dia válido.");
        }

        // (b) Declaração "switch-case-default".
        switch (numero_dias) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não é um dia válido.");
        }

        System.exit(0);
    }
}
