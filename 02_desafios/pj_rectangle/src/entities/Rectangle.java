package entities;

public class Rectangle {
	
	//Atributos
	public double width;
	public double height;
	
	
	//Métodos 
	public double area() {
		return width*height;
	}
	
	public double perimiter() {
		return 2*(width*height);
	}
	
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
	}
	
	public String toString() {
		return 	"AREA = "
				+ String.format("%.2f", area()) + "\n"
				+ "PERIMETER = "
				+ String.format("%.2f", perimiter())+ "\n"
				+ "DIAGONAL = "
				+ String.format("%.2f", diagonal());
	}
	
}
