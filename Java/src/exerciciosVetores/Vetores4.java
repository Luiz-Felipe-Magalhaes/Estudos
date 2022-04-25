package exerciciosVetores;

import java.util.Scanner;

public class Vetores4 {

	public static void main(String[] args) {
		/*
		 * 4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas
		 * consoantes foram lidas. Imprima as consoantes.
		 */

		Scanner sc = new Scanner(System.in);

		char letras[] = new char[10];
		int soma = 0;

		System.out.println("Digite as letras: ");
		for (int i = 0; i < letras.length; i++) {
			letras[i] = sc.next().charAt(0);

			if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
				soma++;
			}
		}
		
		System.out.println("Consoantes Digitas: ");
		
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
				
				System.out.println(letras[i]);
			}
		}

		System.out.println("Quantidade Consoantes: " + soma);

	}

}
