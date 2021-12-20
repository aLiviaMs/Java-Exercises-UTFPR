package exercicios;

import java.util.Scanner;

public class Ex01_VerificaNota {
    public void main(String[] args) {
        System.out.println(formatarData());
    }

    int dia = 02;
    int mes = 8;
    int ano = 2002;

    String formatarData() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
