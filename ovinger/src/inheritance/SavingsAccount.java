package inheritance;

public class SavingsAccount implements Account{
	
	protected double balance = 0;
	protected double interest = 0;
	

	public SavingsAccount() {
		
	}
	
	public SavingsAccount(double interest) {
		this.interest = interest;
	}
	
	public void endYearUpdate() {
		balance *= (1 + interest);
	}
	
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.balance += amount;	
		}
	}
	
    public void withdraw(double amount) {
    	if (amount <= 0) {
    		throw new IllegalArgumentException();
    	} else if (balance - amount < 0){
    		throw new IllegalStateException();
    	} else {
    		balance -= amount;
    	}
    }
    	
    public double getBalance() {
    	return balance;
    }
    	
    
    
    
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
