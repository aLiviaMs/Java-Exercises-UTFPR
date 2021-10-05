package exercicios;

public class Ex04_SomaMediaIntervaloInteiros {
    public static void main(String[] args) {
        somaMediaIntervaloInteiros();
    }

    private static void somaMediaIntervaloInteiros() {
        int limiteInferior = 1, limiteSuperior = 100, soma = 0, i, somaPar = 0, somaImpar = 0;
        float media;

        // (a)Faça o exercício utilizando um laço for.
        for (i = 0; i <= limiteSuperior; i++) {
            soma += i;

            // (c) Modifique o exercício para produzir duas somas: (1) soma dos valores
            // pares contidos no intervalo; soma dos valores Ímpares contidos no intervalo.
            if (soma % 2 == 0) {
                somaPar += soma;
            } else {
                somaImpar += soma;
            }
        }

        media = (soma / (float) limiteSuperior);
        System.out.println("(Feito com laço for) \n" + "A soma de 1 até 100 é: " + soma + "\n A média é: " + media
                + "\n A soma dos valores pares de 1 até 100 é: " + somaPar
                + "\n A soma dos valores ímpares de 1 até 100 é: " + somaImpar + "\n");

        // (b)Faça o exercício utilizando um laço while.
        soma = 0;
        media = 0;
        i = 0;
        somaPar = 0;
        somaImpar = 0;

        while (i <= limiteSuperior) {
            soma += i;
            i++;

            // (c) Modifique o exercício para produzir duas somas: (1) soma dos valores
            // pares contidos no intervalo; soma dos valores Ímpares contidos no intervalo.
            if (soma % 2 == 0) {
                somaPar += soma;
            } else {
                somaImpar += soma;
            }

        }

        media = (soma / (float) limiteSuperior);
        System.out.println("(Feito com laço while) \n" + "A soma de 1 até 100 é: " + soma + "\n A média é: " + media
                + "\n A soma dos valores pares de 1 até 100 é: " + somaPar
                + "\n A soma dos valores ímpares de 1 até 100 é: " + somaImpar + "\n");

    }
}
