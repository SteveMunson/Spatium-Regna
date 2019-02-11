package planet;

import java.util.ArrayList;
import java.util.List;

import core.Location;
import core.Ship;

public class BasicPlanet implements Planet {
	private Location location;
	private String name;
	private List<Ship> shipsInOrbit;

	public BasicPlanet(String planetName, Location location) {
		// TODO Auto-generated constructor stub
		this.setName(planetName);
		this.setLocation(location);
		shipsInOrbit = new ArrayList<Ship>();
	}

	public BasicPlanet() {
		// TODO Auto-generated constructor stub
		this(null, null);
	}

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
	public List<Ship> getShipsInOrbit() {
		// TODO Auto-generated method stub
		return shipsInOrbit;
	}

	@Override
	public void RemoveShipFromOrbit(Ship ship) {
		// TODO Auto-generated method stub
		shipsInOrbit.remove(ship);
	}

	@Override
	public boolean AddShipToOrbit(Ship ship) {
		// TODO Auto-generated method stub
		if (ship.getLocation().equals(this.getLocation())) {
			shipsInOrbit.add(ship);
			return true;
		} else
			return false;
	}

	@Override
	public boolean isOrbiting(Ship ship) {
		// TODO Auto-generated method stub
		return shipsInOrbit.contains(ship);
	}
}
