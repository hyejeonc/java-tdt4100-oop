package encapsulation;

public class Location {
	private int x;
	private int y;
	
	public void setX(int newX) {
		x = newX;
	}
	
	public void setY(int newY) {
		y = newY;
	}
	
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


