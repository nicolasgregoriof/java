package p3_estrutura_repetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exerc5 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		Scanner sc = new Scanner(System.in);

		int qtde_loop = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < qtde_loop; i++) {
			int entrada_usuario = sc.nextInt();
			
			if (entrada_usuario >= 10 && entrada_usuario <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.printf("%d in%n",in);
		System.out.printf("%d out%n",out);

		sc.close();
	}

}
