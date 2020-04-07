package inheritance;

public class BSU extends SavingsAccount{
	
	// 어떤 정해진 수 만큼만 deposit 가능하고 작년에 넣은 것만 뺄 수 있다. 
	// 작년에 넣어놨던 돈 중에서만 이체 가능 
	
	// 새해가 되면 범위 내에 새로운 돈을 넣을 수 있고, 작년에 넣엇던돈은 잠긴다. 
	
	// 또한 이번 년의 디퍼짓의 20퍼센트를세금 감면으로 준다 
	
	//double interest;
	double depositLimit;
	double lastBalance = 0;
	double balance = 0;
	//double lastDepositLimit;
	
	public BSU(double interest) {
		this.interest = interest;
	}
	
	public BSU(double interest, double depositLimit) {
		this.interest = interest;
		this.depositLimit = depositLimit;
	}
	
	@Override
	public void endYearUpdate() {
		if (balance*(1 + interest) > depositLimit) {
			throw new IllegalStateException();
		} else {
			lastBalance = balance*(1 + interest);
			balance = 0;
		}
	}
	
	@Override
	public void deposit(double amount) {
		System.out.println("balance/limit/amount");
		System.out.println(balance);
		System.out.println(depositLimit);
		System.out.println(amount);
		if (amount <= 0) {
			throw new IllegalArgumentException();
		} else if (balance + amount > depositLimit){
    		throw new IllegalStateException();
    	} else {
    		balance += amount;
    	}
	}
	
	@Override
    public void withdraw(double amount) {
    	if (amount <= 0) {
    		throw new IllegalArgumentException();
    	} else if (lastBalance < amount){
    		//throw new IllegalArgumentException();
    	} else {
    		lastBalance -= amount;
    	}
    }
    	
    public double getBalance() {
    	return balance + lastBalance;
    }
    
	
	
	public double getTaxDeduction() {
		//this.endYearUpdate();
		return 0.20*balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
