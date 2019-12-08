package sk.stuba.fiit.account;

public class Account {
	private String IDaccount;
	private String ownerName;
	private double amount;
	
	
	public Account(String ownerName, double amount) {
		super();
		this.ownerName = ownerName;
		this.amount = amount;
		System.out.println("Bol vytvorený úèet na meno: " + this.ownerName + " s vkladom vo vyške: " + this.amount);
	}
	
	void addFunds(double amount) {
		this.amount += amount;
	}
	
	void removeFunds(double amount) {
		if(this.amount >= amount)
		this.amount -= amount;		
	}
	
	
	public String toString() {
		return "Stav: " + this.amount;
	}
	
}
