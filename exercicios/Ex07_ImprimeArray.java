package exercicios;

import java.util.Scanner;

public class Ex07_ImprimeArray {

	public static void main(String[] args) {
		imprimeArray();
	}
	private static void imprimeArray() {
		Scanner scn = new Scanner(System.in);
		int n, i, itemValor = 1; 
		
		System.out.println("Entre com a quantidade dos números: \n");
		n = scn.nextInt();
		
		int[] itens = new int[n];
		
		System.out.println("Entre cada número(Separado por ENTER): ");
		
		for(i = 0; i<n; i++){
			itens[i] = scn.nextInt();
		}
		
		System.out.println("Imprimindo os elementos em sequência... ");
		System.out.print("[");
		for(i = 0; i<n; i++){
			if(itemValor < n)
				System.out.print(itens[i] + ",");
			else 
				System.out.print(itens[i]);
			
			itemValor += i;
		}
		System.out.print("] \n");
		
		System.out.println("Imprimindo os elementos em sequência inversa... ");
		System.out.print("[");
		
		itemValor = n-1;
		
		for(i = n; i>0; i--) {
			
			if(itemValor > 0)
				System.out.print(itens[i-1] + ",");
			else 
				System.out.print(itens[i-1]);
			
			itemValor--;
			
		}
		System.out.print("] \n");
		

				
	}

}
