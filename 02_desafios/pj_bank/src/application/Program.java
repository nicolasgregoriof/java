package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number? ");
		int account_number = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder? ");
		String account_holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char initial_deposit = sc.next().charAt(0);

		Conta conta = new Conta();

		if (initial_deposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double first_deposit = sc.nextDouble();
			conta = new Conta(account_number, account_holder, first_deposit);
		} else {
			conta = new Conta(account_number, account_holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double unit_deposit = sc.nextDouble();
		conta.deposito(unit_deposit);
		System.out.println("Updated Account data: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double unit_withDraw = sc.nextDouble();
		conta.saque(unit_withDraw);
		System.out.println("Updated Account data: ");
		System.out.println(conta);
		
		sc.close();

	}

}
