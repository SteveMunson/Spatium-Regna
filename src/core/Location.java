package core;

public class Location {
	private int x;
	private int y;

	public Location(int x, int y) {
		// TODO Auto-generated constructor stub
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Location loc = (Location) obj;
		return (x == loc.getX() && y == loc.getY());
	}
}