package p2_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class ExModulo2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro 
		// e dizer se este número é par ou ímpar.

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		double resto;
		String res;
		
		num = sc.nextInt();
		
		resto = num % 2;
		
		res = (resto != 0) ? "IMPAR" :"PAR" ;

		System.out.println(res);
		
		sc.close();
		
	}

}
