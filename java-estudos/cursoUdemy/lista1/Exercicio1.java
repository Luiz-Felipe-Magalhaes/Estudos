package cursoUdemy.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	/*
	 * Um programa para ler dois valores inteiros, e depois mostrar na tela a
	 * soma desses números com uma mensagem explicativa
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.print("Digite o valor 1: ");
		valor1 = sc.nextInt();
		
		System.out.print("Digite o valor 2: ");
		valor2 = sc.nextInt();
		
		System.out.printf("Soma dos valores = %d", valor1+valor2);

	}

}
