package p1_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioModulo5 {

	public static void main(String[] args) {
		/* Exércicio 5 - Fazer um programa para ler o código de uma peça 1, 
		 * o número de peças 1, o valor unitário de cada peça 1, 
		 * o código de uma peça 2, o número de peças 2 e o valor 
		 * unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod_peca1, qtde_peca1,cod_peca2, qtde_peca2;
		double valor_peca1, valor_peca2, total;
		
		cod_peca1 = sc.nextInt();
		qtde_peca1 = sc.nextInt();
		valor_peca1 = sc.nextDouble();
		
		cod_peca2 = sc.nextInt();
		qtde_peca2 = sc.nextInt();
		valor_peca2 = sc.nextDouble();
			
		total = (qtde_peca1 * valor_peca1) + (qtde_peca2 * valor_peca2);
					
		System.out.printf("VALOR A PAGAR = %.2f%n",total);
		sc.close();
		
	}

}
