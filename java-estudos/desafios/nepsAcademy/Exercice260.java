package desafios.nepsAcademy;

import java.util.Scanner;

public class Exercice260 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p1, c1, pc1, p2, c2, pc2;
		
		
		do {
			p1 = sc.nextInt();
			c1 = sc.nextInt();
			p2 = sc.nextInt();
			c2 = sc.nextInt();
			
		} while (p1 < 10 || p1 > 100 || c1 < 10 || c1 > 100 || p2 < 10 || p2 > 100 || c2 < 10 || c2 > 100);
		
		pc1 = p1 * c1;
		pc2 = p2 * c2;	
			
		if(pc1 == pc2) {
			System.out.println(0);
		}
		
		else if (pc1 > pc2) {
			System.out.println(-1);
		}
		
		else {
			System.out.println(1);
		}
		
		sc.close();
		
		
	}

}
