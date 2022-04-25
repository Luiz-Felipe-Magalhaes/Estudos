package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice13 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, M;
		
		do {
		A = sc.nextInt();
		M = sc.nextInt();
		
		} while (A < 0 || A > 50 || M < 0 || M > 50 ); 

		if((A + M) <= 50) {
			
			System.out.println("S");
		}
		
		else if ((A + M) > 50) {
			
			System.out.println("N");
		}
		
		sc.close();
	}

}
