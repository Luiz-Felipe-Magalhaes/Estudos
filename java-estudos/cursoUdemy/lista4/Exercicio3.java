package cursoUdemy.lista4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double dollarPrice, dollarBought;

		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		dollarBought = sc.nextDouble();

		System.out.print("Amount to be paid in reais = " + 
		String.format("%.2f", CurrencyConverter.dolarConverter(dollarBought, dollarPrice)));

	}

}
