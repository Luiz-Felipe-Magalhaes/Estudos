package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice86 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double A, B;
				
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		
		if ((A+B)/2 >= 7 ) {
			System.out.println("Aprovado");
		}
		
		
		else if ((A+B)/2 <= 3) {
			System.out.println("Reprovado");
		}
		
		else {
			System.out.println("Recuperacao");
		}
		sc.close();

	}

}
