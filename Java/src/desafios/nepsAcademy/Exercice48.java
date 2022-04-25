package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice48 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, A = 0, M = 0, somaA = 0;

		do {

			N = sc.nextInt();

		} while (N <= 0 || N > 1000);

		do {
			for (int i = 1; i <= N; i++) {

				do {

					A = sc.nextInt();
					somaA += A;

				} while (A <= 0 || A > 1000000);

				if (M == 0) {

					if (somaA >= 1000000) {

						M = i;

					}
				}

			}

		} while (somaA < 1000000);

		System.out.print(M);

		sc.close();

	}

}
