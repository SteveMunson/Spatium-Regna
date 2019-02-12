package planet;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PlanetNameGenerator {

	private static final int AVERAGE_WORD_LENGTH = 6;
	private static Random r = new Random();
	private Map<String, List<String>> map;
	int numberofWords = 0;
	int totalLength = 0;
	int shortest = 9990;
	int longest = 0;

	public PlanetNameGenerator(String wordListFileName) {
		super();
		map = new HashMap<String, List<String>>();

		Path path = Paths.get(wordListFileName);
		try {
			readWordList(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String get() {
		return get(AVERAGE_WORD_LENGTH);
	}

	public String get(int length) {
		// TODO Auto-generated method stub
		System.out.println("-----");
		int rn = r.nextInt(map.size());
		String prefix = (String) map.keySet().toArray()[rn];
		List<String> output = new ArrayList<>(Arrays.asList(prefix.split(" ")));
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("Prefix: " + prefix);
			System.out.println("Suffix: " + map.get(prefix));
			List<String> suffix = map.get(prefix);
			if (suffix != null) {
				if (suffix.size() == 1) {
					output.add(suffix.get(0));
				} else {
					rn = r.nextInt(suffix.size());
					output.add(suffix.get(rn));
				}
			} else {
				length = output.size();
			}
			if (output.size() >= length) {
				for (String s : output) {
					sb.append(s);
				}
				return sb.toString();
			}
			prefix = output.get(output.size() - 2) + " " + output.get(output.size() - 1);
		}

	}

	private void readWordList(Path path) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(path.getFileName());
		scanner.useDelimiter(" ");
		String letter = null;
		while (scanner.hasNext()) {
			String word = scanner.nextLine();
			word = word.split(" ")[0];
			System.out.println("\nWord: " + word);
			totalLength += word.length();
			numberofWords++;
			if (word.length() < shortest)
				shortest = word.length();
			else if (word.length() > longest)
				longest = word.length();
			List<String> snips = new ArrayList<String>();
			int index = 0;
			for (int i = 1; i < word.length(); i++) {
				letter = word.substring(i, i + 1);
				if (letter.matches("[aeiouy]") || i == word.length() - 1) {
					String sub = word.substring(index, i + 1);
					index = i + 1;
					System.out.println("Sub: " + sub);
					snips.add(sub.toLowerCase());
				}
			}
			// take snips and put into map
			System.out.println("Prefixes: " + (snips.size() - 2));
			if (snips.size() > 2) {
				for (int i = 0; i < snips.size() - 2; i++) {
					String key = snips.get(i) + " " + snips.get(i + 1);
					if (!map.containsKey(key)) {
						ArrayList<String> list = new ArrayList<>();
						list.add(snips.get(i + 2));
						map.put(key, list);
					} else {
						map.get(key).add(snips.get(i + 2));
					}
					System.out.println(key + " - " + map.get(key));
				}
			}

		}
		scanner.close();
		System.out.println("Avg word length: " + (totalLength / numberofWords));
		System.out.println("Shortest: " + (shortest));
		System.out.println("Longest: " + (longest));
	}
}
