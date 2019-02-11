package planet;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanetNameGenerator {

	public PlanetNameGenerator(String wordListFileName, int prefixSize) {
		super();
		Path path = Paths.get(wordListFileName);
		try {
			readWordList(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void readWordList(Path path) throws IOException {
		// TODO Auto-generated method stub
		List<String> snips = new ArrayList<String>();
		Scanner scanner = new Scanner(path.getFileName());
		scanner.useDelimiter(" ");
		String letter = null;
		while (scanner.hasNext()) {
//			String word = scanner.next();
			String word = scanner.nextLine();
			word = word.split(" ")[0];
			System.out.println(word);
			int index = 0;
			while (index < word.length() - 1) {
				String sub = word.substring(index, index + 1);
				do {
					index++;
					if (index < word.length())
						letter = word.substring(index, index + 1);
					sub = sub + letter;
				} while (letter.matches("[aeiouy]"));
				System.out.println(sub);
				snips.add(sub);
			}
		}
		scanner.close();
	}
}
