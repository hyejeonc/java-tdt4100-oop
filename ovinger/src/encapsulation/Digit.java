package encapsulation;

public class Digit {
	private int base;
	private int value;
	

	
	public Digit(int base) {
		this.base = base;	
		this.value = 0;
		if (base < 0) {
			throw new IllegalArgumentException("Invalid value");
		}
	}
	
	public void setBase(int newBase) {
		if (newBase < 0) {
			throw new IllegalArgumentException("Invalid value");
		} else {
			base = newBase;
		}
	}
	
	public void setValue(int newValue) { 
		value = newValue;
	}
	
	public int getBase() {
		return base;
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
	
	public String toString() {
		if (value >= 10) { 
			return String.valueOf((char) ('A' + value - 10) );
		} else {
			return String.valueOf(value);
		}
	}

	public static void main(String arg[]) {
		Digit number = new Digit(10);
	}
}
