package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Digite o nome: ");
		student.name = sc.nextLine();
		
		System.out.print("Digite a nota do semestre 1: ");
		student.n1 = sc.nextDouble();
		
		System.out.print("Digite a nota do semestre 2: ");
		student.n2 = sc.nextDouble();
		
		System.out.print("Digite a nota do semestre 3: ");
		student.n3 = sc.nextDouble();
		System.out.println();
		
		student.soma(student.n1, student.n2, student.n3);
		System.out.println(student);
		
		sc.close();

	}

}
