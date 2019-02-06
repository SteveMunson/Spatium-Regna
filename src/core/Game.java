package core;

public class Game {

	public Game() {
		super();
		Universe universe = new Universe();
		Ship ship = new NoviceShip();
		ship.setLocation(universe.getLocation(2, 4));
		ship.setName("Firefly");
		System.out.println("Ship: " + ship);
		System.out.println("Loc: " + universe.getLocation(2, 4));
		System.out.println("Loc: " + universe.getLocation(2, 8));
	}
}