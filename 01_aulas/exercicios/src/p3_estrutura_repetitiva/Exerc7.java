package p3_estrutura_repetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exerc7 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtde_loop = sc.nextInt();

		for (int i = 0; i < qtde_loop; i++) {

			Double val1 = sc.nextDouble();
			Double val2 = sc.nextDouble();
			
			if (val2 == 0) {
				System.out.println("divisao impossivel");
			} 
			else {
				Double resultado = val1 / val2; 
				System.out.printf("%.1f%n", resultado);
			}

		}

		sc.close();
	}

}
