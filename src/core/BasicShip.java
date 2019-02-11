package core;

public abstract class BasicShip implements Ship {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Planet getOrbit() {
		return orbit;
	}

	private Location location;
	private String name;
	private Planet orbit;

	public BasicShip() {
		super();
		System.out.println("Created BasicShip.");
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return this.location;
	}

	public boolean setLocation(Location location) {
		// TODO Auto-generated method stub
		if (location.addEntity(this)) {
			this.location = location;
			return true;
		}
		return false;
	}

	public boolean changeLocation(Location location) {
		// TODO Auto-generated method stub
		Location from = this.location;
		from.removeEntity(this);
		location.addEntity(this);
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
