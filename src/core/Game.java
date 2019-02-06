package core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Game implements Serializable {
	private Universe universe;
	private List<Ship> ships;
	private String gameNumber;

	public Game() {
		super();
		setGameNumber(String.valueOf(java.time.Clock.systemUTC().millis()));
		 universe = new Universe();
		ships = new ArrayList<Ship>();
//		Ship ship = new NoviceShip();
//		ship.setLocation(universe.getLocation(2, 4));
//		ship.setName("Firefly");
//		System.out.println("Ship: " + ship);
//		System.out.println("Loc: " + universe.getLocation(2, 4));
//		System.out.println("Loc: " + universe.getLocation(2, 8));
	}

	public String getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(String gameNumber) {
		// TODO Auto-generated method stub
		this.gameNumber = gameNumber;
	}


	public Universe getUniverse() {
		// TODO Auto-generated method stub
		return universe;
	}

	public void addShip(Ship ship) {
		// TODO Auto-generated method stub
		ships.add(ship);
	}

	public String getNumber() {
		// TODO Auto-generated method stub
		return gameNumber;
	}
}