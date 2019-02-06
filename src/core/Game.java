package core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Game implements Serializable {
	private Universe universe;
	private List<Ship> ships;
	private String gameNumber;

	public Game() {
		this(String.valueOf(java.time.Clock.systemUTC().millis()));
	}

	public Game(String gameNumber) {
		super();
		setGameNumber(gameNumber);
		universe = new Universe();
		ships = new ArrayList<Ship>();
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