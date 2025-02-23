package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dtContract = LocalDate.parse(sc.nextLine(),fmt);
		
		System.out.print("Valor do contrato: ");
		double value = sc.nextDouble();
		
		System.out.print("Entre com o numero de parcelas: ");
		int parc = sc.nextInt();
		sc.nextLine();
		
		Contract contract = new Contract(num,dtContract,value);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, parc);
		
		System.out.print("Parcelas:");
		for (Installment installment : contract.getInstallment()) {
			System.out.println(installment);  
		}
		    
		sc.close();

	}

}
