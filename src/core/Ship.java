package core;

public interface Ship extends Locatable, Nameable {

	boolean setOrbit(Planet planet);

	boolean setLocation(Location location);
}
