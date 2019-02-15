package core;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import file.CustomFormatter;
import file.FileTools;
import ships.Ship;

public class Game implements Serializable {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final boolean APPEND = true;
	private static FileHandler fileHandler;

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
		LOGGER.log(Level.INFO, "Creating game number " + gameNumber);
		LogManager logmanager = LogManager.getLogManager();
		Logger log = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
		try {
			fileHandler = new FileHandler("./" + gameNumber + "/SR_" + gameNumber + ".log", APPEND);
			fileHandler.setFormatter(new CustomFormatter());
			log.addHandler(fileHandler);
		} catch (SecurityException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		log.info("This is in the game log");

		// create game directory
		Path p = null;
		Path dir = null;
		try {
			p = FileTools.getGameDirectory();
			p = p.resolve(getGameNumber());
			dir = Files.createDirectories(p);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Created game directory: " + dir.toString());
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