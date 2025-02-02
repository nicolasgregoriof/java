package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollar_price = sc.nextDouble();
		System.out.println();

		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		System.out.println();

		double result = CurrencyConverter.dollar_value(dollar_price, amount);

		System.out.printf("Amount to be paid in reais = %.2f%n", result);

		sc.close();

	}

}
