package ships;

import java.io.Serializable;

import core.Locatable;
import core.Location;
import core.Nameable;
import planet.Planet;

public interface Ship extends Locatable, Nameable, Serializable {

	boolean setOrbit(Planet planet);

	boolean setLocation(Location location);

	boolean changeLocation(Location location);
}
