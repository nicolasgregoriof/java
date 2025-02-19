package p3_estrutura_repetitiva;

import java.util.Scanner;
import java.util.Locale;

public class Exerc3 {

	public static void main(String[] args) {
		// Um Posto de combustíveis deseja determinar qual de seus produtos tem 
		// a preferência de seus clientes. Escreva um algoritmo para ler o
		// tipo de combustível abastecido (codificado da seguinte forma:
		// 1.Álcool 2.Gasolina 3.Diesel	4.Fim). 
		// Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
		// deve ser solicitado um novo código (até que seja válido). 
		// O programa será encerrado quando o código informado for o número 
		// 4. Deve ser escrito a ensagem: "MUITO OBRIGADO" e a quantidade 
		// de clientes que abasteceram cada tipo de combustível, conforme exemplo.
				
		Scanner sc = new Scanner(System.in);
		
		int tp_alcool = 0;
		int tp_gasolina = 0;
		int tp_diesel = 0;
		
		int tp_conbustivel = sc.nextInt();
		
		while (tp_conbustivel != 4) {
			
			if (tp_conbustivel < 1 || tp_conbustivel > 4) {
				System.out.println("Digite um código válido!");
			}
			else if (tp_conbustivel == 1) {
				tp_alcool += 1 ;
			}
			else if (tp_conbustivel == 2) {
				tp_gasolina += 1;
			}
			else if (tp_conbustivel == 3) {
				tp_diesel += 1;
			}
			
			tp_conbustivel = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", tp_alcool);
		System.out.printf("Gasolina: %d%n", tp_gasolina);
		System.out.printf("Diesel: %d%n", tp_diesel);
		
		sc.close();

	}

}
