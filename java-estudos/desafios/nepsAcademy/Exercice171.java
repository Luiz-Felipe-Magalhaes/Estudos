package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice171 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		System.out.printf("%.4f", Math.pow(x, y));
		
		sc.close();

	}

}
