package core;

import java.io.Serializable;
import java.util.Random;

import planet.PlanetNameGenerator;

public class Universe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int X_SIZE = 10;
	private static final int Y_SIZE = 10;
	private static final double SYSTEM_DENSITY = 0.1;
	private Location location[][];
	private PlanetNameGenerator planetNameGenerator;
	private int numberOfSystems;
	private Random r;
	private int xSize;
	private int ySize;

	public Universe() {
		this(X_SIZE, Y_SIZE);
	}

	public Universe(int xSize, int ySize) {
		super();
		System.out.println("Creating universe...");
		this.xSize = xSize;
		this.ySize = ySize;
		r = new Random();
		location = new Location[xSize][ySize];
		for (int x = 0; x < xSize; x++)
			for (int y = 0; y < ySize; y++)
				location[x][y] = new Location(x, y);
		numberOfSystems = (int) ((xSize * ySize) * SYSTEM_DENSITY);
		System.out.println("Naming " + numberOfSystems + " systems...");
		planetNameGenerator = new PlanetNameGenerator("planets.txt");
		for (int i = 0; i < numberOfSystems; i++) {
			Location loc;
			do {
				loc = getRandomLocation();
			} while (loc.getName() != null);
			loc.setName(planetNameGenerator.get());
			System.out.println(loc);
		}
		System.out.println("Done. " + xSize + " x " + ySize);
	}

	private Location getRandomLocation() {
		// TODO Auto-generated method stub
		int x = r.nextInt(xSize);
		int y = r.nextInt(ySize);
		return location[x][y];
	}

	public Location getLocation(int x, int y) {
		return location[x][y];
	}
}