package exerciciosVetores;

import java.util.Scanner;

public class Vetores2 {
	//Ler um vetor, e escreve-lo de forma invertida;

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
		
		for (int i = (vetor.length-1); i <= vetor.length && i >= 0; i--) {		
			System.out.println(vetor[i]);
		}
		
		sc.close();
	
	}

}
