package exercicios;

import java.util.Scanner;

public class Ex11_Matrix {
	public static void main(String[] args) {
		matrix();
	}

	private static void matrix() {
		Scanner scn = new Scanner(System.in);

		int[][] matrixMN = new int[2][3];
		int m, n;

		for (m = 0; m < 2; m++) {
			for (n = 0; n < 3; n++) {
				System.out.println("Insira um valor para a posição (" + (m) + ", " + (n) + ") EX11");
				matrixMN[m][n] = Integer.parseInt(scn.nextLine());
			}
		}

		System.out.println("\nC1        C2        C3 ");
		System.out.println("*****************************");

		for (m = 0; m < 2; m++) {
			for (n = 0; n < 3; n++) {
				System.out.print(matrixMN[m][n] + "        ");
			}
			System.out.print("* L" + (m + 1));
			System.out.print("\n");
		}

		/*
		 * (a)Para uma matriz quadrada (M == N), escreva um programa que calcule o
		 * seguinte: (1) soma e média dos valores na diagonal principal da matriz; (2)
		 * soma e média dos valores na diagonal secundária da matriz; (3) diferença
		 * entre a soma dos valores na diagonal principal e a soma dos valores na
		 * diagonal secundária da matriz.
		 */

		int[][] MatrizQuadrada = new int[2][2];
		int mediaDp = 0, somaDp = 0, mediaDs = 0, somaDs = 0, diferenca = 0, linhas, colunas;

		for (linhas = 0; linhas < 2; linhas++) {
			for (colunas = 0; colunas < 2; colunas++) {
				System.out.println("\n Insira um valor para a posição (" + (linhas) + ", " + (colunas) + ") EX11 (a)");
				MatrizQuadrada[linhas][colunas] = Integer.parseInt(scn.nextLine());

				if (linhas == colunas) {
					somaDp += MatrizQuadrada[linhas][colunas];
				}

				if ((linhas + colunas) == 1) {
					somaDs += MatrizQuadrada[linhas][colunas];
				}
			}
		}

		mediaDp = somaDp / 2;
		mediaDs = somaDs / 2;
		diferenca = somaDp - somaDs;

		System.out.println("\nC1        C2");
		System.out.println("*******************");

		for (linhas = 0; linhas < 2; linhas++) {
			for (colunas = 0; colunas < 2; colunas++) {
				System.out.print(MatrizQuadrada[linhas][colunas] + "        ");
			}
			System.out.print("* L" + (linhas + 1));
			System.out.print("\n");
		}

		System.out.println("(1) soma e média dos valores na diagonal principal da matriz: " + somaDp + " " + mediaDp);
		System.out.println("(2) soma e média dos valores na diagonal secundária da matriz: " + somaDs + " " + mediaDs);
		System.out.println(
				"(3) diferença entre a soma dos valores na diagonal principal e a soma dos valores na diagonal secundária da matriz: "
						+ diferenca);

	}
}
