package cursoUdemy.lista4;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Banco contaTeste;
		
		String nomeTitular;
		double depositoInicial;
		int numeroConta;
		char opcaoDepositoInicial;
					
		System.out.print("Enter account number: ");
		numeroConta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		nomeTitular = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");					
		opcaoDepositoInicial = sc.next().charAt(0);
		
		if (opcaoDepositoInicial == 'y') {
			System.out.print("Enter initial deposit value: ");
			depositoInicial = sc.nextDouble();
			
			contaTeste = new Banco(numeroConta, nomeTitular, depositoInicial);
		}
		
		else {
			contaTeste = new Banco(numeroConta, nomeTitular);
		}
		System.out.println("Account data:\n" + contaTeste);
		
		System.out.print("Enter a deposit value: ");
		contaTeste.deposito(sc.nextDouble());
		System.out.println("Account data:\n" + contaTeste);
		
		System.out.print("Enter a withdraw value: ");
		contaTeste.saque(sc.nextDouble());
		System.out.println("Account data:\n" + contaTeste);
		
		
	}

}
