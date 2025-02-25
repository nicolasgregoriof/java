package p2_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class ExModulo5 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia 
		//o código de um item e a quantidade deste item. 
		//A seguir, calcule e mostre o valor da conta a pagar.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod_produto = sc.nextInt();
		int qtde_produto = sc.nextInt();
		double result = 0.00;
		String msg = "Código de produto inexistente!"; 
		
		switch (cod_produto) {
		case 1:
			result = qtde_produto*4.00;
			System.out.printf("Total: R$ %.2f ", result);
			break;
		case 2:
			result = qtde_produto*4.50;
			System.out.printf("Total: R$ %.2f ", result);
			break;
		case 3:
			result = qtde_produto*5.00;
			System.out.printf("Total: R$ %.2f ", result);
			break;
		case 4:
			result = qtde_produto*2.00;
			System.out.printf("Total: R$ %.2f ", result);
			break;
		case 5:
			result = qtde_produto*1.50;
			System.out.printf("Total: R$ %.2f ", result);
			break;
		default:
			msg = "Código de produto inexistente!"; 
			System.out.println(msg);
		}
		
		sc.close();
	}

}
