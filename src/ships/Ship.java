package ships;

import java.io.Serializable;

import core.Locatable;
import core.Location;
import core.Nameable;
import planet.Planet;

public interface Ship extends Locatable, Nameable, Serializable {

	public boolean setOrbit(Planet planet);

	public boolean setLocation(Location location);

	public boolean changeLocation(Location location);

	public int getMass();

	public void setMass(int amount);

	public int getVolume();

	public void setHull(Hull hull);
}
