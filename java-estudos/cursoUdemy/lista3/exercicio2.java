package cursoUdemy.lista3;

import java.util.Scanner;

public class exercicio2 {

	/*
	 * Escreva um programa que repita a leitura de uma senha até que ela seja
	 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta é o valor 2002.
	 */
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cadastre uma senha: ");
		int senha = sc.nextInt();

		System.out.print("- LOGIN -\nSenha:");
		int senhaDigitada = sc.nextInt();
		
		while (senhaDigitada != senha) {
			
			System.out.println("Senha Invalida");
			
			System.out.print("Senha:");
			senhaDigitada = sc.nextInt();			
		}
		
		System.out.println("Acesso Permitido");
		
	}

}
