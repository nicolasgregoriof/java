package p3_estrutura_repetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exerc8 {

	public static void main(String[] args) {
		/*
		 * Ler um número inteiro N e calcular todos os seus divisores.
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}

		}

		sc.close();
	}

}
