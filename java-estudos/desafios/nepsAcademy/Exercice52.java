package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice52 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, n, interruptor, i1 = 0, i2 = 0;

		do {
			n = sc.nextInt();
		} while (n < 2 || n > 100000);

		for (int i = 0; i < n; i++) {

			interruptor = sc.nextInt();

			while (interruptor != 1 && interruptor != 2)
				;

			if (interruptor == 1) {
				i1++;
			}

			else if (interruptor == 2) {
				i2++;
			}

		}

		if ((i1 + i2) % 2 == 0) {
			a = 0;
		} else {
			a = 1;
		}

		if (i2 % 2 == 0) {
			b = 0;
		} else {
			b = 1;
		}

		System.out.println(a);
		System.out.println(b);
		
		sc.close();

	}

}
