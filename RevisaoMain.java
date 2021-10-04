package lista01;

import java.util.Calendar;
import java.util.Scanner;

public class RevisaoMain {

	public static void main(String[] args) {

		ex11_arrayMultidimensional();

	}

	private static void ex11_arrayMultidimensional() {

		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrixB = new int[3][3];

		int count = 1;

		for (int i = 0; i < matrixB.length; i++) {

			for (int j = 0; j < matrixB[i].length; j++) {

				matrixB[i][j] = count++;

			}
		}

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(matrixA[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(matrixB[i][j] + " ");

			}
			System.out.println();
		}

	}

	private static void ex10_percorrendoArray() {

		float[] vetor = new float[] { 2.5f, 2.6f, 8.4f, 10f };

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		char[] alfabeto = new char[26];
		for (int i = 0; i < alfabeto.length; i++) {
			alfabeto[i] = (char) (97 + i);
		}

		for (int i = 0; i < alfabeto.length; i++) {
			System.out.print(alfabeto[i] + " ");

		}

	}

	private static void ex9_indexandoArrays() {

		String[] frutas = new String[] { "Banana", "Laranja", "Goiaba" };

		System.out.println(frutas[0]);
		System.out.println(frutas[1]);
		System.out.println(frutas[2]);
		// System.out.println(frutas[3]); //cuidado
		System.out.println(frutas[frutas.length - 1]);

	}

	private static void ex8_declaracaoArrays() {

		byte[] vetorBytes;
		short[] vetorShorts;
		long[] vetorLongs;
		float[] vetorFloats;
		double[] vetorDoubles;
		boolean[] vetorBooleans;
		char[] vetorChars;
		String[] vetorStrings;

		float[] notas = new float[10];

		String[] frutas = new String[] { "Banana", "Laranja", "Goiaba" };

		System.out.println("Tamanho frutas: " + frutas.length);

	}

	private static void ex7_forLoops2() {

		System.out.println();
		System.out.println("Tabuadas ... ");

		for (int fator = 1; fator <= 10; fator++) {

			for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

				int resultado = fator * multiplicador;
				System.out.println(fator + " x " + multiplicador + " = " + (resultado));
			}

			System.out.println();

		}

	}

	private static void ex6_forLoops1() {

		for (int count = 0; count <= 10; count++) {
			System.out.print(count + " ");
		}

		System.out.println();
		for (int count = 0; count <= 10; count++) {

			if (count == 5)
				break;

			System.out.print(count + " ");
		}

		System.out.println();
		for (int count = 0; count <= 10; count++) {

			if (count == 5)
				continue;

			System.out.print(count + " ");
		}

		System.out.println();

		for (int count = 10; count >= 0; count--) {
			System.out.print(count + " ");
		}

		System.out.println();
		for (int count = 10; count >= 0; count--) {
			if (count % 2 == 0)
				System.out.print(count + " ");
			else
				System.out.print("  ");
		}

		System.out.println();
		for (int count = 10; count >= 0; count = count - 2) {
			System.out.print(count + "   ");
		}

	}

	private static void ex5_whileLoops3() {

		int x = 0;
		int n = 10000;

		while (x < n) {

			// qual o problema aqui?

		}

	}

	private static void ex3_whileLoops1() {

		Scanner leitor = new Scanner(System.in);
		// leitor.useLocale(Locale.ENGLISH);

		double nota;

		do {
			System.out.println("Entre com uma nota entre 0 e 10 (1-10): ");
			nota = leitor.nextDouble();

		} while (nota < 0 || nota > 10);

	}

	private static void ex4_whileLoops2() {

		int x = 0;
		int n = 10;

		while (x < n) {

			System.out.println("Valor de x: " + ++x);

		}

	}

	private static void ex2_condicionais() {

		// if (true) {
		// System.out.println("Positivo!");
		// }
		//
		// int a = 11;
		//
		// if (a == 10) {
		//
		// System.out.println("Positivo");
		//
		// } else {
		//
		// System.out.println("Negativo!");
		//
		// }

		int horaDia = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String saudacao;

		if (horaDia >= 6 && horaDia <= 12) {
			saudacao = "Bom dia!";
		} else if (horaDia > 12 && horaDia <= 18) {
			saudacao = "Boa tarde!";
		} else if (horaDia > 19 && horaDia <= 24) {
			saudacao = "Boa noite!";
		} else {
			saudacao = "Olá!";
		}

		System.out.println(saudacao);

	}

	private static void ex1_variaveis() {

		int a, b;
		int x = 10, y = 10;
		float temperatura = 22.4f;
		double pi = 3.14159;
		char c = 'A';
		char d = 111;

		System.out.println(x + " " + y);
		System.out.println(x + y);
		System.out.println(temperatura + y);
		System.out.println(c + pi);
		System.out.println(d);

	}

}
