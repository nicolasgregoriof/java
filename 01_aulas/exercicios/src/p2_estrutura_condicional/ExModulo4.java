package p2_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class ExModulo4 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. 
		// A seguir calcule a duração do jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro, tendo uma duração mínima
		// de 1 hora e máxima de 24 horas
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int h_inicio = sc.nextInt();
		int h_fim = sc.nextInt();
		int result;
		
		if (h_inicio < h_fim) {
			result = (h_fim - h_inicio);
		}else {
			result = (24 - h_inicio) + h_fim;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)",result);
		
		sc.close();
	}

}
