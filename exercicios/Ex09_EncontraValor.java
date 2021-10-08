package exercicios;

import java.util.Scanner;

public class Ex09_EncontraValor {
	public static void main(String[] args) {
		encontraValor();
	}
	private static void encontraValor() {
		Scanner scn = new Scanner(System.in);
		
		float buscarValor;
		float[] arr = {1.3f,4.4f,3.2f,2,10,15,20,25};
		int i = 0;
		boolean achou = false;
		
		System.out.println("Array: {1,3f , 4,4f , 3,2f , 2 , 10 , 15 , 20 ,25}");
		
		System.out.println("Digite o valor a ser procurado: ");
		buscarValor = scn.nextFloat();
		
		
		while(achou == false && i < arr.length){
			if(arr[i] == buscarValor)
				achou = true;
			
			i++;
		}
		
		if(achou == true) 
			System.out.println("O elemento " + buscarValor +" pertence ao Array.");
		else 
			System.out.println("O elemento " + buscarValor + " não pertence ao Array.");
	}
}
