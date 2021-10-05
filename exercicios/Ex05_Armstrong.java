package exercicios;

import java.lang.Math;

public class Ex05_Armstrong {

    public static void main(String[] args) {
        System.out.println("Números Armstrong entre 1 e 500: ");
        for (int i = 0; i <= 500; i++) {
            // chamando função armstrong.
            if (armstrong(i))
                System.out.print(i + "\n");
        }

    }

    // função booleana que retorna verdadeiro caso seja um numero armstrong.
    static boolean armstrong(int numero) {
        int temp, digitos = 0, ultimoNumero = 0, soma = 0;
        // temp = variavel temporária.
        temp = numero;

        while (temp > 0) {
            temp = temp / 10;
            digitos++;
        }

        temp = numero;

        while (temp > 0) {
            // determina o último dígito do número
            ultimoNumero = temp % 10;

            soma = (int) (soma + (Math.pow(ultimoNumero, digitos)));

            // remove ultimo digito.
            temp = temp / 10;
        }

        if (numero == soma)
            return true;
        else
            return false;
    }
}
