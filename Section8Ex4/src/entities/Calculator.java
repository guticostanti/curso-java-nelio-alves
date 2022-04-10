package entities;

public class Calculator {
	
	public double dollarPrice, amountBoughtInDollars, amountToBePaidInReais;
	public final double iof = 0.06;
	
	public double calculate() {
		amountToBePaidInReais = dollarPrice * amountBoughtInDollars - amountBoughtInDollars * iof;
		return amountToBePaidInReais;
	}
}
