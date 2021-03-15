package planet;

import java.util.List;

import core.Locatable;
import core.Nameable;
import ships.Ship;

public interface Planet extends Locatable, Nameable {
	public List<Ship> getShipsInOrbit();

	public void RemoveShipFromOrbit(Ship ship);

	public boolean AddShipToOrbit(Ship ship);

	public boolean isOrbiting(Ship ship);

	public int getResourceLevel();

	public void setResourceLevel(int level);

	public int getTechLevel();

	public void setTechLevel(int level);
}
