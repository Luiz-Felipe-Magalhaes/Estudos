package cursoUdemy.lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		/*
		 * Ler 20 valores, armazenar num vetor 
		 * Armazenar os numeros pares num vetor par
		 * Armazenar os numeros impares num vetor impar
		 * Imprimir os tres vetores
		 * Utilizando List
		 */
		
		Scanner sc = new Scanner(System.in);
		int vetor [] = new int[4];
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
				
		System.out.println("Digite os valores do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			
			if (vetor[i] % 2 == 0 && vetor[i] > 0) {
				pares.add(vetor[i]);
			}
			
			if (vetor[i] % 2 != 0 && vetor[i] > 0) {
				impares.add(vetor[i]);
			}		
		}
		
		
		System.out.println("Vetor:");
		for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);	
		}
		
		System.out.println("Pares:");
		for (Integer x : pares) {
			System.out.println(x);
		}
		
		System.out.println("Impares:");
		for (Integer x : impares) {
			System.out.println(x);
		}

	}

}
