/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. 
 */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int num = sc.nextInt();

		String[] vect_nome = new String[num];
		int[] vect_idade = new int[num];
		double[] vect_altura = new double[num];

		double soma_altura = 0;
		int contIdade16 = 0;

		for (int i = 0; i < vect_nome.length; i++) {
			System.out.printf("Dados da: %da pessoa:\n", i + 1);

			System.out.print("Nome: ");
			sc.nextLine();
			vect_nome[i] = sc.nextLine();

			System.out.print("Idade: ");
			vect_idade[i] = sc.nextInt();
			contIdade16 = (vect_idade[i] < 16) ? contIdade16 + 1 : contIdade16 + 0;

			System.out.print("Altura: ");
			vect_altura[i] = sc.nextDouble();
			soma_altura += vect_altura[i];
		}

		double media_alt = soma_altura / vect_altura.length;
		System.out.println();
		System.out.printf("Altura média: %.2f\n", media_alt);
		double percentual = ((double) contIdade16 / vect_idade.length) * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);

		for (int i = 0; i < vect_nome.length; i++) {
			if (vect_idade[i] < 16) {
				System.out.println(vect_nome[i]);
			}
		}

		sc.close();
	}

}
