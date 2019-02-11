package core;

import java.io.Serializable;

public class Universe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int X_SIZE = 10;
	private static final int Y_SIZE = 10;
	Location location[][];

	public Universe() {
		this(X_SIZE, Y_SIZE);
	}

	public Universe(int xSize, int ySize) {
		super();
		System.out.println("Creating universe...");
		location = new Location[xSize][ySize];
		for (int x = 0; x < xSize; x++)
			for (int y = 0; y < ySize; y++)
				location[x][y] = new Location(x, y);
		System.out.println("Done. " + xSize + " x " + ySize);
	}

	public Location getLocation(int x, int y) {
		return location[x][y];
	}
}