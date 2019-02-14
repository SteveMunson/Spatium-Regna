package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import file.CustomFormatter;

public class StellaRegnum {
	private static final boolean APPEND = true;
	private static FileHandler fileHandler;

	public static void main(String[] args) throws SecurityException, IOException {
		Universe u;
		LogManager logmanager = LogManager.getLogManager();
		Logger appLog = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
		fileHandler = new FileHandler("StellaRegnum.log", APPEND);
		fileHandler.setFormatter(new CustomFormatter());
		appLog.addHandler(fileHandler);
		// Create new game
		Game game = new Game("8675309");

		// Add items to the game
		System.out.println("========== First ==========");
		u = game.getUniverse();
		Ship ship = new NoviceShip();
		ship.setLocation(u.getLocation(2, 4));
		ship.setName("Firefly");
		game.addShip(ship);
		u.getLocation(2, 4).listEntities();
		String number = game.getGameNumber();

		// save the game
		try {
			save(game);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// change the game
		System.out.println("========== Change ==========");
		ship.setName("NewName");
		ship.changeLocation(u.getLocation(2, 5));
		u.getLocation(2, 4).listEntities();
		u.getLocation(2, 5).listEntities();

		// load the saved game
		System.out.println("========== Recover ==========");

		try {
			game = load(number);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		u = game.getUniverse();
		u.getLocation(2, 4).listEntities();

//		System.out.println(png.get(6));
//		try {
//			FileTools.stripAfterFirstWord(Paths.get("planets.txt"));
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		g.run();
//		g.results();		
//		g.save();
	}

	private static Game load(String number) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream(number + ".srg");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Game g = (Game) objectInputStream.readObject();
		objectInputStream.close();
		return g;
	}

	private static void save(Game game) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fileOutputStream = new FileOutputStream(game.getNumber() + ".srg");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(game);
		objectOutputStream.flush();
		objectOutputStream.close();
	}
}
