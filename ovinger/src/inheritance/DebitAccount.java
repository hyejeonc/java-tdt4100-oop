package inheritance;

public class DebitAccount extends AbstractAccount {
	
	public DebitAccount(double deposit) {
		if (balance < 0) {
			throw new IllegalStateException();
		} else {
			balance += deposit;
		}
	}
	
	public void internalWithdraw(double internalWithdraw) {
		if ((internalWithdraw < 0) || (balance - internalWithdraw < 0)) {
			throw new IllegalStateException();
		} else {
			balance -= internalWithdraw;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
