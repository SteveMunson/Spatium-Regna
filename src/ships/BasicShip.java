package ships;

import core.Location;
import planet.Planet;

public class BasicShip implements Ship {
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
	private int mass;
	private Hull hull;

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

	@Override
	public int getMass() {
		// TODO Auto-generated method stub
		return this.mass;
	}

	@Override
	public void setMass(int amount) {
		// TODO Auto-generated method stub
		this.mass = amount;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return mass*3;
	}

	@Override
	public void setHull(Hull hull) {
		// TODO Auto-generated method stub
		this.hull=hull;
	}
}
