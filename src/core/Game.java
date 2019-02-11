package core;

import java.io.Serializable;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import file.FileTools;

public class Game implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Universe universe;
	private List<Ship> ships;
	private String gameNumber;

	public Game() {
		this(String.valueOf(java.time.Clock.systemUTC().millis()));
	}

	public Game(String gameNumber) {
		super();
		setGameNumber(gameNumber);
		// create game directory

		Path p = null;
		try {
			p = FileTools.getGameDirectory();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p);
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