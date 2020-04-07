package inheritance;

public class SavingAccount2 extends AbstractAccount {
	
	//private double creditLine;
	private int x;
	private double fee;
	private int count;

	
	public SavingAccount2(int x, double fee) {
		this.x = x;
		this.fee = fee;
		
	}
	
	
	public void internalWithdraw(double internalWithdraw) {
		
		if ((internalWithdraw < 0) || (balance - internalWithdraw <= 0)) {
			throw new IllegalStateException();
		} else {
			if (count > x) {
				balance -= (internalWithdraw+fee);
			} else {
				balance -= internalWithdraw;
			}
			
		}
		
	}
	
	//public void withdraw(double withdraw) {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
