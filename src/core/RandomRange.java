package core;

import java.util.Random;

public class RandomRange {

	public static int get(int low, int high) {
		// TODO Auto-generated method stub
		Random r = new Random();
		return r.nextInt(high-low+1)+low;
	}
}