package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {
	
	private LocalDate manufacture;
	
	DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	UsedProduct(){
	}
	
	
	public UsedProduct(String name, Double price, LocalDate manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}


	public LocalDate getManufacture() {
		return manufacture;
	}


	public void setManufacture(LocalDate manufacture) {
		this.manufacture = manufacture;
	}


	@Override
	public String priceTag() {
		return name + 
			   " $" + 
			   String.format("%.2f", price) +
			   " (Manufacture date: " +
			   manufacture.format(fmt) + 
			   ")";
	}
}
