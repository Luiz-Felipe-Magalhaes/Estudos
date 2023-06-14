package exerciciosVetores;

import java.util.Scanner;

public class Vetores5 {

	public static void main(String[] args) {
		/*
		 * Ler 20 valores, armazenar num vetor 
		 * Armazenar os numeros pares num vetor par
		 * Armazenar os numeros impares num vetor impar
		 * Imprimir os tres vetores
		 */
		
		Scanner sc = new Scanner(System.in);
		int vetor [] = new int[4];
		int pares [] = new int[4];
		int impares [] = new int [4];
				
		System.out.println("Digite os valores do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			
			if (vetor[i] % 2 == 0 && vetor[i] > 0) {
				pares[i] = vetor[i];	
			}
			
			if (vetor[i] % 2 != 0 && vetor[i] > 0) {
				impares[i] = vetor[i];	
			}		
		}
		
		for (int i = 0; i < pares.length; i++) {
			if (vetor[i] % 2 == 0 && vetor[i] > 0) {
				pares[i] = vetor[i];	
			}		
		}
		
		for (int i = 0; i < impares.length; i++) {
			if (vetor[i] % 2 != 0 && vetor[i] > 0) {
				impares[i] = vetor[i];	
			}		
		}
		
		System.out.println("Vetor:");
		for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);	
		}
		
		System.out.println("Pares:");
		for (int i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);	
			}
		
		System.out.println("Impares:");
		for (int i = 0; i < impares.length; i++) {
			System.out.println(impares[i]);	
			}
	}

}
