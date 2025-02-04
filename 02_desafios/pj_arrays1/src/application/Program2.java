/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.print("Quantos numeros você vai digitar? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[num];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ",vect[i]);
			soma += vect[i]; 
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f",  soma/vect.length);
		
		sc.close();

	}

}
