package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int num = sc.nextInt();;
		int[] vect_numeros = new int[num];
		int cont = 0;
		
		for (int i = 0; i < vect_numeros.length; i++) {
			System.out.print("Digite um numero: ");
			vect_numeros[i] = sc.nextInt();
			
			if (vect_numeros[i] % 2 == 0) {
				cont++;
			}
		}
		
		System.out.println();
		System.out.print("NUMEROS PARES: \n");
		for (int i = 0; i < vect_numeros.length; i++) {
			if (vect_numeros[i] % 2 == 0) {
				System.out.printf("%d ",vect_numeros[i]);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + cont);
		
		sc.close();
		
	}

}
