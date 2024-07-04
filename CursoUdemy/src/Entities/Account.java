package Entities;

public class Account {

	private int accNumber;
	private String accHolder;
	private double balance;

	public Account(int accNumber, String accHolder, double initialDeposit) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		deposit(initialDeposit);
	}

	public int getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getAcctHolder() {
		return accHolder;
	}

	public void deposit(double Value) {
		balance += Value;
	}

	public void withdraw(double Value) {
		balance -= Value + 5.00;
	}

	public void accountData() {
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accNumber, accHolder, balance);
		System.out.println();
	}
}