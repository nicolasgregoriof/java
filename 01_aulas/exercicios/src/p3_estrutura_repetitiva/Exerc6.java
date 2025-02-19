package p3_estrutura_repetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exerc6 {

	public static void main(String[] args) {
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtde_loop = sc.nextInt();
		
		for (int i = 0; i < qtde_loop; i++) {
			
			Double val1 = sc.nextDouble();
			Double val2 = sc.nextDouble();
			Double val3 = sc.nextDouble();

			Double media = (val1 * 2.0 + val2 * 3.0 + val3 * 5.0) / 10.0 ;
			
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}

