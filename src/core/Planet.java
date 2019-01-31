package core;

import java.util.List;

public interface Planet extends Locatable, Nameable {
	public List<Ship> getShipsInOrbit();

	public void RemoveShipFromOrbit(Ship ship);

	public boolean AddShipToOrbit(Ship ship);

	public boolean isOrbiting(Ship ship);
}
