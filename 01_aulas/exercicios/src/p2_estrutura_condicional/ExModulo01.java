package p2_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class ExModulo01 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, 
		// e depois dizer se este número é negativo ou não
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();

	}

}
