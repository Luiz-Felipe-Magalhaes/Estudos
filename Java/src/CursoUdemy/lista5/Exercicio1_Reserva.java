package cursoUdemy.lista5;

import java.util.Scanner;

public class Exercicio1_Reserva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Reserva reservas[] = new Reserva[10];
		
		System.out.println("Quantos quartos estão disponiveis?");
		int quartosDisponiveis = sc.nextInt();
		
		for (int i = 1; i <= quartosDisponiveis; i++) {
			System.out.println();
			System.out.println("Reserva " + i + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeCliente = sc.nextLine();
			System.out.print("Email: ");
			String emailCliente = sc.nextLine();
			System.out.print("Quarto: ");
			int numQuarto = sc.nextInt();
			reservas[numQuarto] = new Reserva(nomeCliente, emailCliente);		
		}
		
		System.out.println();
		System.out.println("Lista de Quartos: ");
		for (int i = 0; i < 10; i++) {
			if (reservas[i] != null) {
				System.out.println(i + ": " + reservas[i]);
			}
		}
	}

}
