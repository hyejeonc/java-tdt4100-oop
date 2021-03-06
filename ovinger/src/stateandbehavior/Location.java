package stateandbehavior;

public class Location {
	private int x;
	private int y;
	
	public void up() {
		y--;
	}
	
	public void down() {
		y++;
	}
	
	public void left() {
		x--;
	}
	
	public void right() {
		x++;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public String toString() {
		return "Location: (" + x + ", " + y + ")";
	}

	public static void main(String arg[]) {
		Location coord = new Location();
		coord.x = 0;
		coord.y = 0;
	}
}


