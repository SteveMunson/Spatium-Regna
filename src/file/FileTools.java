package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileTools {

	public static Path getGameDirectory() throws URISyntaxException {
		String current = null;
		try {
			current = new java.io.File(".").getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Paths.get(current);
	}

	public static void stripAfterFirstWord(Path filename) throws URISyntaxException, IOException {
		Scanner scanner = new Scanner(filename);
		List<String> words = new ArrayList<String>();
		while (scanner.hasNext()) {
			String word = scanner.nextLine();
			System.out.println(word);
			word = word.split(" ")[0];
			words.add(word.toLowerCase());
		}
		scanner.close();
		Collections.sort(words);
		BufferedWriter out = new BufferedWriter(new FileWriter("new_" + filename));
		for (String w : words) {
			out.write(w);
			out.newLine();
		}
		out.flush();
		out.close();
	}
}
