package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(100, "Gustavo", 500000.00);
		BusinessAccount bacc = new BusinessAccount(101, "Empresa", 3000.00, 400000.00);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(102, "acc2", 300.00, 200.00);
		Account acc3 = new SavingsAccount(103, "acc3", 300.00, 598.00);
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(400.00);
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(40.00);
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
		}
	}

}
