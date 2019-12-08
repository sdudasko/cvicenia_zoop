package sk.stuba.fiit.account;

import java.util.ArrayList;

public class AccauntManager {

	ArrayList<Account> bankAccaunts = new ArrayList();
	//LinkedList 
	
	void transferMoney(Account a, Account b, double amount) { // z A do B
		a.removeFunds(amount);
		b.addFunds(amount);
	}
	
	
}
