package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Product " + i + " data:" );
			System.out.print("Common, used or imported (c/u/i)?");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: " );
			String name = sc.nextLine();
			
			System.out.print("Price: " );
			double price = sc.nextDouble();
			
			if (option == 'c') {
				list.add(new Product(name,price)); 
			}
			else if (option == 'u') {
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(),fmt);
				list.add(new UsedProduct(name,price,manufactureDate));
			}
			else {
				System.out.print("Taxa de importacao: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
	
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();

	}

}
