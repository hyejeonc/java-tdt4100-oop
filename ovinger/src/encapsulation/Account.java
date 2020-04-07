package encapsulation;


public class Account {
	private double balance;
	private double interestRate; // percentage point 
	
	public Account() {	
	}
	
	public Account(double balance, double interestRate) {
		if (balance < 0 || interestRate < 0) {
			throw new IllegalArgumentException("Negative value");
		} else {
			this.balance = balance;
			this.interestRate = interestRate;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double newInterestRate) {
		if (newInterestRate >= 0) {
		interestRate = newInterestRate; // increase the account amount but only if it is positive
		} else {
			throw new IllegalArgumentException("Negative value");
		}
	}
	
	public void deposit(double money) {
		if (money > 0) {
		balance += money; // increase the account amount but only if it is positive
		} else {
			throw new IllegalArgumentException("Negative value");
		}
	}
	
	public void withdraw(double money) {
		
		if (money > 0 && money <= balance) {
		balance -= money; // increase the account amount but only if it is positive
		} else {
			throw new IllegalArgumentException("Negative value");
		}
	}
	
	public void addInterest() {
		// calculate the interest rate and adds it to the account amount 
		balance = balance * (1 + interestRate / 100);
	}
	
	public String toString() {
		return "Balance is: " + balance + "\n and interest rate is: " + interestRate;
	}

	public static void main(String arg[]) {
		Account dnb = new Account();
		dnb.balance = 22000;
		dnb.interestRate = 1.28;
	}

}
