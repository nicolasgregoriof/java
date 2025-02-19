package p1_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioModulo3 {

	public static void main(String[] args) {
		/* Exercício 3 - Faça um programa para ler o valor do raio de um círculo, 
		   e depois mostrar o valor da área deste círculo com quatro 
		   casas decimais conforme exemplos.
		   Fórmula da área: area = π . raio2
		   Considere o valor de π = 3.14159.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double num1, resultado;
		num1 = sc.nextDouble();
			
		resultado = 3.14159 * Math.pow(num1,2.0); 
		System.out.printf("A = %.4f%n",resultado);
		sc.close();
		
	}

}
