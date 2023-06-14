package cursoUdemy.lista2;

import java.util.Scanner;

public class exercicio2 {

	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
	 * ímpar
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.print("Digite um numero inteiro: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O numero digitado é par.");
		}

		else {
			System.out.println("O numero digitado é impar.");
		}

	}

}
