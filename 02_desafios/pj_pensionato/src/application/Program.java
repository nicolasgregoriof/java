package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente[] rooms = new Cliente [10];
		
		System.out.print("How many rooms will be rented? ");
		int numbersRooms = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<numbersRooms; i++) {
			System.out.printf("Rent #%d:\n", i+1);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			Cliente cli = new Cliente(name, email);
			
			System.out.print("Room: ");
			int numberRoom = sc.nextInt();
			
			rooms[numberRoom] = cli;
			
			sc.nextLine();
		}
		
		System.out.println("\nBusy rooms:");
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s, %s\n",i,rooms[i].getName(),rooms[i].getEmail());
			}
		}
		
		sc.close();
		
	}

}
