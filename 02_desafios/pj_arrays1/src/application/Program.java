/*Faça um programa que leia um número inteiro positivo N (máximo = 10) 
 e depois N números inteiros e armazene-os em um vetor. 
 Em seguida, mostrar na tela todos os números negativos lidos. 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros você vai digitar? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[num];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
