package p1_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioModulo2 {

	public static void main(String[] args) {
		/* Exercício 2 - Fazer um programa para ler quatro valores inteiros A, B, C 
		 * e D. A seguir, calcule e mostre a diferença do produto de A e B 
		 * pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a,b,c,d, resultado;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
			
		resultado = a * b - c* d; 
		System.out.printf("DIFERENCA = %d%n",resultado);
		sc.close();
		
	}

}
