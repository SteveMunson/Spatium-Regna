package ships;

import core.RandomRange;

public class ShipFactory {
	public static Ship get(ShipType type) {
		Ship ship = new BasicShip();
		switch (type) {
		case SmallFighter:
			ship.setMass(100);
			ship.setHull(new Hull(0.02, 1.0));
			break;
		default:
			break;
		}

		return ship;
	}
}
