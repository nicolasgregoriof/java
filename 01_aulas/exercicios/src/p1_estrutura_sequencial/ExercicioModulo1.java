package p1_estrutura_sequencial;

import java.util.Scanner;

public class ExercicioModulo1 {

	public static void main(String[] args) {
		/*
		 * Exercício 1 - Faça um programa para ler dois valores inteiros, e depois
		 * mostrar na tela a soma desses números com uma mensagem explicativa, conforme
		 * exemplos.
		 */
		Scanner sc = new Scanner(System.in);
		int num1, num2, resultado;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		resultado = num1 + num2;
		System.out.printf("SOMA = %d%n", resultado);
		sc.close();

	}

}
