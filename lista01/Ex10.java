package lista01;

import java.util.Scanner;

public class Ex10 {

    // atualizar
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float imc = 0, peso, altura;

        peso = scn.nextFloat();
        altura = scn.nextFloat();

        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if (imc > 18.5 && imc <= 25) {
            System.out.println("Peso ideal");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc > 30 && imc <= 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc > 35 && imc <= 40) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }

    }

}
