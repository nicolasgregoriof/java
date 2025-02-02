package entities;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;

	public static double dollar_value( double dollar_price, double dollar_quantify) {
		return (dollar_quantify * dollar_price) * (1.0 + IOF); 
	}
	
}
