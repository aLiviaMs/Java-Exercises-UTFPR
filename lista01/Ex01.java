package lista01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x1, y1, x2, y2;
        float distanciaPontos = 0;

        System.out.println("Digite, respectivamente, o eixo X e o eixo Y do ponto A: ");
        x1 = scn.nextInt();
        y1 = scn.nextInt();

        System.out.print("\n");

        System.out.println("Digite, respectivamente, o eixo X e o eixo Y do ponto B: ");
        x2 = scn.nextInt();
        y2 = scn.nextInt();

        distanciaPontos = (float) Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));

        System.out.print("A distância entre os Pontos é igual a: " + distanciaPontos);
    }

}
