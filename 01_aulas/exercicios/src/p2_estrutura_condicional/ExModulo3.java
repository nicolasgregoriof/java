package p2_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class ExModulo3 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar 
		// uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		// indicando se os valores lidos são múltiplos entre si. 
		// Atenção: os números devem poder ser digitados em
		// ordem crescente ou decrescente.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		double res1, res2;
		String mult_y = "São Multiplos";
		String mult_n = "Nao são multiplos";
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		res1 = num1 % num2;
		res2 = num2 % num1;
		
		if (res1 == 0 || res2 == 0) {
			System.out.println(mult_y);
		} else {
			System.out.println(mult_n);
		}
		
		sc.close();
	}

}
