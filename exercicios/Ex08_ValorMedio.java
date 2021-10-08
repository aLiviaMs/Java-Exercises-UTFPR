package exercicios;

import java.util.Scanner;

public class Ex08_ValorMedio {
	public static void main(String[] args) {
		valorMedio();
	}
	private static void valorMedio() {
		Scanner scn = new Scanner(System.in);
		int tamanhoArr;
		float media, total=0;
		
		System.out.println("Entre com a quantidade dos números: \n");
		tamanhoArr = scn.nextInt();
		
		
		float[] arr = new float[(int) tamanhoArr];
		
		System.out.println("Entre cada número(Separado por ENTER): ");
		for(int i = 0; i < tamanhoArr; i++){
			arr[i] = scn.nextFloat();
			total += arr[i];
		}
		media = total/tamanhoArr;
		System.out.println("Valor médio do array: " + media);
	}
}
