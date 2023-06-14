package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice145 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if (x == 0) {
			System.out.println("nulo");
		}

		else if (x > 0) {
			System.out.println("positivo");
		}

		else {
			System.out.println("negativo");
		}
		
		sc.close();

	}

}
