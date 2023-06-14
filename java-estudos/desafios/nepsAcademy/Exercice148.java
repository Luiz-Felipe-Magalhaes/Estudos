package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice148 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int bino, cino;

		do {
			
			bino = sc.nextInt();
			cino = sc.nextInt();
			
		} while (bino > 10 || bino < 0 || cino > 10 || cino < 0);
		
		if ((bino + cino) % 2 == 0) {
			System.out.println("Bino");
		}
		
		else {
			System.out.println("Cino");
		}
		
		sc.close();

	}

}
