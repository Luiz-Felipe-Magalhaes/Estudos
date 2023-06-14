package cursoUdemy.lista1;

import java.util.Scanner;

public class exercicio5 {
	
	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double precoPeca1, precoPeca2, precoTotal;
		
		System.out.print("Codigo da Peça: ");
		codPeca1 = sc.nextInt();
		
		System.out.printf("Quantidade de Peças %d: ",codPeca1);
		qtdPeca1 = sc.nextInt();
		
		System.out.printf("Preço unitario da Peça %d: ",codPeca1);
		precoPeca1 = sc.nextInt();
		
		System.out.print("Codigo da Peça: ");
		codPeca2 = sc.nextInt();
		
		System.out.printf("Quantidade de Peças %d: ",codPeca2);
		qtdPeca2 = sc.nextInt();
		
		System.out.printf("Preço unitario da Peça %d: ",codPeca2);
		precoPeca2 = sc.nextInt();
		
		precoTotal = qtdPeca1 * precoPeca1 + qtdPeca2 * precoPeca2;
		
		System.out.printf("Valor total: R$%.2f",precoTotal);
		
	}

}
