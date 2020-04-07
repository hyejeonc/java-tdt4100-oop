package encapsulation;

public class UpOrDownCounter {
	private int start;
	private int end;
	private int counter;
	
	public UpOrDownCounter(int start, int end) {
		this.start = start;
		this.end = end;
		this.counter = start; 
		if (start == end){
			throw new IllegalArgumentException("Invalid value");
		}
	}
	
	public int getCounter(){
		return counter;
	}
	
	public boolean count(){
		if (counter == end) {
			return false;
		} else {
			if (start < end){
				counter++;
				if (counter == end) {
					return false;
				} else {
					return true;
				}
				
			} else {
				counter--;
				if (counter == end) {
					return false;
				} else {
					return true;
				}
			}
		}
	}
	
	public static void main(String arg[]) {
		UpOrDownCounter number = new UpOrDownCounter(1, 10);
	}
}
