package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice324 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, l, c, coposQuebrados = 0;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			l = sc.nextInt();
			c = sc.nextInt();

			if (l > c) {
				coposQuebrados += c;

			}

		}

		System.out.print(coposQuebrados);

		sc.close();
	}

}
