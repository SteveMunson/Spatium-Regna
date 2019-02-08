package file;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

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
}
