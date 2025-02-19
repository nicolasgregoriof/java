package p3_estrutura_repetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exerc9 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
		 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d%n", i, quadrado, cubo);

		}

		sc.close();
	}

}
