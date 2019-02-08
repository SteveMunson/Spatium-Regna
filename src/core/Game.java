package core;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;

import file.FileTools;

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