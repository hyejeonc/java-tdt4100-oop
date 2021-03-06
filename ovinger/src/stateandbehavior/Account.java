package stateandbehavior;

public class Account {
	private double balance;
	private double interestRate; // percentage point 
	
	public void deposit(double money) {
		if (money > 0) {
		balance += money; // increase the account amount but only if it is positive
		}
	}
	public void addInterest() {
		// calculate the interest rate and adds it to the account amount 
		balance = balance * (1 + interestRate / 100);
	}
	
	public double getBalance() {
		return balance; // return amount in account
	}
	
	public double getInterestRate() {
		return interestRate; // return interest rate in percent 
	}
	
	public void setInterestRate(double newInterestRate) {
		interestRate = newInterestRate; // update the interest rate to be the new value 
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


		

