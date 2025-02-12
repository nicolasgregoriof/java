package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Emplyoee> list = new ArrayList<>();
		
		System.out.print("Quantos colaboradores você deseja registrar? ");
		Integer qtdColab = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < qtdColab; i++) {
			System.out.printf("Emplyoee #%d: \n",i+1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salario: ");
			Double salary = sc.nextDouble();
			
			Emplyoee emp = new Emplyoee(id, name, salary);
			
			list.add(emp);
			System.out.println();
		}
		
		System.out.print("Informe o id do colaborador que deseja aumentar o salário: ");
		Integer idColab = sc.nextInt();
		sc.nextLine();

		boolean exists = false;
		for (Emplyoee emp : list) {
		    if (emp.getId().equals(idColab)) {
		        exists = true;
		        break; // Parar a busca assim que encontrar
		    }
		}
		
		if (exists) {
		
			System.out.print("Informe o percentual de aumento: ");
			Double percentage = sc.nextDouble();
			
			for (Emplyoee x : list) {
				if (x.getId().equals(idColab)) {
					x.salaryIncrease(percentage);	
				}
			}
		} else {
			System.out.println("Este ID não existe!");
		}
		
		System.out.println("\nLista de colaboradores: ");
		
		for (Emplyoee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
}
