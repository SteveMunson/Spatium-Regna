package core;

public class BasicShip implements Ship {
	private Location location;
	private String name;
	private Planet orbit;

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return this.location;
	}

	@Override
	public boolean setLocation(Location location) {
		// TODO Auto-generated method stub
		this.location = location;
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public String toString() {
		return (getName() + " [" + getLocation().getX() + "," + getLocation().getY() + "]");
	}

	@Override
	public boolean setOrbit(Planet planet) {
		// TODO Auto-generated method stub
		if (location != null) {
			if (planet.AddShipToOrbit(this)) {
				this.orbit = planet;
				return true;
			}
		}
		return false;
	}
}
