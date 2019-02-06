package core;

public class Universe {
	private static final int X_SIZE = 10;
	private static final int Y_SIZE = 10;
	Location location[][];

	public Universe() {
		super();
		location = new Location[X_SIZE][Y_SIZE];
		for (int x = 0; x < X_SIZE; x++)
			for (int y = 0; y < Y_SIZE; y++)
				location[x][y] = new Location(x, y);
	}

	public Location getLocation(int x, int y) {
		return location[x][y];
	}
}