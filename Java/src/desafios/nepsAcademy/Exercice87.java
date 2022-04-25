package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice87 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int P, R;
		
		P = sc.nextInt();
		R = sc.nextInt();
		
		if (P == 0) {
			System.out.println("C");
			
		}
		
		else if (P == 1 && R == 1) {
			System.out.println("A");
		}
		
		else if (P == 1 && R == 0) {
			System.out.println("B");
		}
		
		sc.close();
	}

}
