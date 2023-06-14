package cursoUdemy.lista2;

import java.util.Scanner;

public class exercicio1 {
	
	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
	 * negativo ou não.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("O numero digitado é positivo.");
			
		}
		
		else {
			System.out.println("O numero digitado é negativo.");
		}

	}

}
