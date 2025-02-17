package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	ImportedProduct(){	
	}
	

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	
	@Override
	public String priceTag() {
		return name + 
			   " $" + 
			   String.format("%.2f", price) +
			   " (Customs fee: $" +
			   customsFee + 
			   ")";
	}
	
}
