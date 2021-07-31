package cursoUdemy.lista4;

public class CurrencyConverter {
	
	public double dollarBought;
	public double dollarPrice;

	public static double dolarConverter (double dollarBought, double dollarPrice) {
			
		return dollarBought * dollarPrice + (dollarBought * dollarPrice * 6/100);
	}	
	
	
}
