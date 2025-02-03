package entities;

public class Conta {
	//encapsulamento
	private int conta_num;
	private String conta_titular;
	private double conta_balance;
	private final double taxa = 5.00; 
	
	//construtores
	public Conta() {	
	}
	
	public Conta (int conta_num,  String conta_titular, double initial_deposit) {
		this.conta_num = conta_num;
		this.conta_titular = conta_titular;
		deposito(initial_deposit);
	}
	
	//Sobrecarga
	public Conta (int conta_num,  String conta_titular) {
		this.conta_num = conta_num;
		this.conta_titular = conta_titular;
	}
	
	//Métodos
	public int getConta_num() {
		return conta_num;
	}

	public String getConta_titular() {
		return conta_titular;
	}

	public void setConta_titular(String conta_titular) {
		this.conta_titular = conta_titular;
	}

	public double getConta_balance() {
		return conta_balance;
	}

	public void deposito(double conta_balance) {
		this.conta_balance += conta_balance;
	}
	
	public void saque(double conta_balance) {
		this.conta_balance -= conta_balance + this.taxa;
	}
	
	public String toString() {
		return "Account "
				+ conta_num
				+ ", Holder: "
				+ conta_titular
				+ ", Balance: $ "
				+ String.format("%.2f", conta_balance);
	}
	
}
