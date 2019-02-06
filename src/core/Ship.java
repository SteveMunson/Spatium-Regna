package core;

import java.io.Serializable;

public interface Ship extends Locatable, Nameable, Serializable {

	boolean setOrbit(Planet planet);

	boolean setLocation(Location location);

	boolean changeLocation(Location location);
}
