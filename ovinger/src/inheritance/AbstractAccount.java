package inheritance;

abstract class AbstractAccount {
	protected double balance = 0;
	
	public AbstractAccount() {
	}
	
	public AbstractAccount(double balance) {
		this.balance += balance;
	}

	public void deposit(double deposit) {
		if (deposit > 0) {
			this.balance += deposit;	
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void withdraw(double withdraw) {
		if (withdraw >= 0 && (balance - withdraw) >= 0) {
			this.balance -= withdraw;	
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	abstract void internalWithdraw(double internalWithdraw);
	
	public double getBalance() {
		return balance;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
