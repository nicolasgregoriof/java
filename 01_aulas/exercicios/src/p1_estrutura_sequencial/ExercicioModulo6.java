package p1_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioModulo6 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi, point_a, point_b, point_c, area_rt, area_c, area_t, area_q, area_retangulo;

		pi = 3.14159;
		point_a = sc.nextDouble();
		point_b = sc.nextDouble();
		point_c = sc.nextDouble();

		/*
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 */
		area_rt = (point_a * point_c) / 2;

		/* b) a área do círculo de raio C. (pi = 3.14159) */
		area_c = pi * Math.pow(point_c, 2.0);

		/* c) a área do trapézio que tem A e B por bases e C por altura. */
		area_t = ((point_a + point_b) * point_c) / 2;

		/* d) a área do quadrado que tem lado B. */
		area_q = Math.pow(point_b, 2.0);

		/* e) a área do retângulo que tem lados A e B. */
		area_retangulo = point_a * point_b;

		System.out.printf("TRIANGULO = %.3f%nCIRCULO = %.3f%nTRAPEZIO = %.3f%nQUADRADO = %.3f%nRETANGULO = %.3f%n",
				area_rt, area_c, area_t, area_q, area_retangulo);

		sc.close();

	}

}
