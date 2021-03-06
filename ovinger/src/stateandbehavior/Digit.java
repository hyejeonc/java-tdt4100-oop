package stateandbehavior;

public class Digit {
	
	private int base;
	private int value;
	
	public Digit(int base) {
		this.base = base;
				
	}
	public int getValue() { 
		return value;
	}
	
	public boolean increment() {
		if (++value >= base) {
			value = 0;
			return true;
		} else {
			return false;
		}
	}
	
	public int getBase() {
		return base;
	}
	
	public String toString() {
		if (value >= 10) { 
			return String.valueOf((char) ('A' + value - 10) );
		} else {
			return String.valueOf(value);
		}
	}

	public static void main(String arg[]) {
		Digit number = new Digit(8);
		number.base = 8;
		number.value = 3;
	}
}
