package cursoUdemy.lista2;

import java.util.Scanner;

public class exercicio1 {
	
	/*
	 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero �
	 * negativo ou n�o.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("O numero digitado � positivo.");
			
		}
		
		else {
			System.out.println("O numero digitado � negativo.");
		}

	}

}
