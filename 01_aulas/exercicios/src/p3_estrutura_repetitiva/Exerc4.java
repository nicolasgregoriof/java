package p3_estrutura_repetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exerc4 {

	public static void main(String[] args) {
		// Leia um valor inteiro X (1 <= X <= 1000). 
		// Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		// X, se for o caso.
				
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
