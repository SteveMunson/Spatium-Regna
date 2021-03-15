package planet;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlanetNameGenerator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> planetNames;

	public PlanetNameGenerator(String filename) {
		// TODO Auto-generated constructor stub
		Path path = Paths.get(filename);
		planetNames = new ArrayList<String>();
		try {
			readWordList(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void readWordList(Path path) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(path.getFileName());
		while (scanner.hasNext()) {
			String word = scanner.nextLine();
			planetNames.add(word);
		}
		scanner.close();
	}

	public String get() {
		// TODO Auto-generated method stub
		Random r = new Random();
		return planetNames.get(r.nextInt(planetNames.size()));
	}

}
