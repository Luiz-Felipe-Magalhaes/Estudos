package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores3 {

	public static void main(String[] args) {
		// Receber 4 notas, mostrar as notas e a media

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double notas[] = new double[4];
		double media = 0;
		
		System.out.println("Digite as notas:");
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = sc.nextDouble();
			media += notas[i]/notas.length;
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas: " + notas[i]);
		}
		
		System.out.printf("/nMédia: %.1f", media);
	}

}
