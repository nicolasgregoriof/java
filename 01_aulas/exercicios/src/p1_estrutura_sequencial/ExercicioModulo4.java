package p1_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioModulo4 {

	public static void main(String[] args) {
		/* Exercício 4 - Fazer um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário. A seguir, mostre o 
         * número e o salário do funcionário, com duas casas decimais.. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int id,horas_trab;
		double valor_hora, salario;
		
		id = sc.nextInt();
		horas_trab = sc.nextInt();
		valor_hora = sc.nextDouble();
			
		salario = horas_trab * valor_hora;
					
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",id,salario);
		sc.close();
		
	}

}
