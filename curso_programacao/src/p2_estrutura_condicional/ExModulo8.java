package p2_estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class ExModulo8 {

	public static void main(String[] args) {
	
		// Calculo de imposto de renda com uma lógica específica!
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if(salario > 2000.00 && salario <= 3000.00) {
			double x = salario - 2000.00;
			double res = x * 0.08;
			System.out.printf("R$ %.2f ", res);
		}
		else if(salario > 3000.00 && salario <= 4500.00) {
			double x = salario - 3000.00;
			double res = x * 0.18 + ((3000.00 - 2000.01) * 0.08);
			System.out.printf("R$ %.2f ", res);
		}
		else  {
			double x = salario - 4500.00;
			double res = x * 0.28 + ((3000.00 - 2000.01) * 0.08) + ((4500.00-3000.01) * 0.18);
			System.out.printf("R$ %.2f ", res);
		}

		sc.close();
	}

}
