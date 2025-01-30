package p3_estrutura_repetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exerc2 {

	public static void main(String[] args) {
		// Escreva um programa para ler as coordenadas (X,Y) 
		// de uma quantidade indeterminada de pontos no sistema
		// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
		// O algoritmo será encerrado quando pelo menos uma de duas coordenadas 
		// for NULA (nesta situação sem escrever mensagem alguma).
				
		Scanner sc = new Scanner(System.in);
		
		double ponto_x = sc.nextDouble();
		double ponto_y = sc.nextDouble();
		
		
		while (ponto_x != 0 && ponto_y !=0) {
			
			if (ponto_x > 0 && ponto_y > 0) {
				System.out.println("primeiro");
			} 
			else if(ponto_x < 0 && ponto_y > 0) {
				System.out.println("segundo");
			}
			else if(ponto_x < 0 && ponto_y < 0) {
				System.out.println("terceiro");
			}
			else  {
				System.out.println("quarto");
			}
			
			ponto_x = sc.nextDouble();
			ponto_y = sc.nextDouble();
		}
		
		sc.close();

	}

}
