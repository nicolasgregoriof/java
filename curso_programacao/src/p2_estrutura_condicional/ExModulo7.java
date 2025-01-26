package p2_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class ExModulo7 {

	public static void main(String[] args) {
	
		//Criar um ponto cartesiado.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ponto_x = sc.nextDouble();
		double ponto_y = sc.nextDouble();
		
		if (ponto_x == 0 && ponto_y == 0) {
			System.out.println("Origem");
		}
		else if(ponto_x == 0) {
			System.out.println("Eixo Y");
		}
		else if(ponto_y == 0) {
			System.out.println("Eixo X");
		}
		
		
		else if (ponto_x > 0 && ponto_y > 0) {
			System.out.println("Q1");
		} 
		else if(ponto_x < 0 && ponto_y > 0) {
			System.out.println("Q2");
		}
		else if(ponto_x < 0 && ponto_y < 0) {
			System.out.println("Q3");
		}
		else  {
			System.out.println("Q4");
		}

		sc.close();
	}

}
