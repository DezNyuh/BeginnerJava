package exercicios.entities;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double convertion(double dollarPrice, double dollarBought) {
		return dollarPrice * dollarBought * (1.0 + IOF);
	}
}
