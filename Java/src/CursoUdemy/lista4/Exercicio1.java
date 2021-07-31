package cursoUdemy.lista4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Rectangle retangulo = new Rectangle();

		System.out.println("Enter retangulo width and height: ");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();

		System.out.printf("AREA = %.2f", retangulo.area());
		System.out.printf("\nPERIMETER = %.2f", retangulo.perimeter());
		System.out.printf("\nDIAGONAL = %.2f", retangulo.diagonal());

	}

}
