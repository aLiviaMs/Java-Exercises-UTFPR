package lista01;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String[] gabarito = new String[10];
        String[] aluno = new String[5];
        String[] nota = new String[5];
        String fim = " ";

        int notaFinal = 0;

        System.out.println("Informea as 10 respostas da prova de 'A' a 'E'");

        for (int i = 0; i < gabarito.length; i++) {
            System.out.println("Questão " + (i + 1) + ": ");
            gabarito[i] = scn.next();
            while (!gabarito[i].equals("A") && !gabarito[i].equals("B") && !gabarito[i].equals("C")
                    && !gabarito[i].equals("D") && !gabarito[i].equals("E")) {
                System.out.println("Escreva uma alternativa de A até E. ");
                gabarito[i] = scn.next();
            }

        }

        while (!fim.equals("FIM") || aluno.length == 5) {
            for (int i = 0; i < aluno.length; i++) {
                System.out.println("Digite o nome do aluno ");
                aluno[i] = scn.next();
                fim = aluno[i];

                if (fim.equals("FIM")) {
                    System.out.println("Fim de alunos.");
                } else {
                    for (int x = 0; x < 10; x++) {
                        System.out.println("Questão " + (x + 1) + ": ");
                        nota[i] = scn.next();
                    }
                }
            }
            System.out.println(fim);
        }

        while (!fim.equals("FIM") || aluno.length == 5) {
            for (int i = 0; i < aluno.length; i++) {
                if (gabarito[i] == nota[i]) {
                    notaFinal++;
                }
                System.out.println("Aluno: " + aluno[i]);

                System.out.println("Nota: " + notaFinal + ". \n ");
            }
        }

    }

}
