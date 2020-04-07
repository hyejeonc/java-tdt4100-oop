package inheritance;

public class CreditAccount extends AbstractAccount {
	
	public double creditLine;
	
	public CreditAccount(double creditLine) {
		if (creditLine < 0 && (balance < -creditLine)) {
			throw new IllegalArgumentException();	
		} else {
			this.creditLine = creditLine;
		}
	}
	
	public void getCreditLine(double creditLine) {
		this.creditLine = creditLine;
	}
	
	public double setCreditLine() {
		return creditLine;
	}
	
	public void internalWithdraw(double internalWithdraw) {
		if ((internalWithdraw < 0) || (balance - internalWithdraw < -creditLine)) {
			throw new IllegalStateException();
		} else {
			balance -= internalWithdraw;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
