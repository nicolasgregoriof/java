package entities;

public class Student {
	public String name;
	public double n1,n2,n3,total_grade;
	
	public void soma(double n1, double n2, double n3) {
		this.total_grade = n1 + n2 + n3;
	}
	
	public String toString() {
		if (this.total_grade >= 60.00) {
			return "FINAL GRADE = " + String.format("%.2f", total_grade)
			+ "\n" +"PASS" ;
		}
		else {
			return "FINAL GRADE = " + String.format("%.2f", total_grade) 
				+ "\n" +"FAILED" 
				+ "\n" +"MISSING " + String.format("%.2f", 60 - total_grade) + " POINTS";
		}
	}
	
}
