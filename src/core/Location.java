package core;

import java.util.ArrayList;
import java.util.List;

public class Location {
	private int x;
	private int y;
	private List<Locatable> entities;

	public Location(int x, int y) {
		// TODO Auto-generated constructor stub
		this.setX(x);
		this.setY(y);
		entities = new ArrayList<Locatable>();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Location loc = (Location) obj;
		return (x == loc.getX() && y == loc.getY());
	}

	public boolean addEntity(Locatable entity) {
		// TODO Auto-generated method stub
		return entities.add(entity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Location (" + x + "," + y + ")");
		if (entities.size() > 0) {
			for (Locatable e : entities) {
				sb.append(", ");
				sb.append(e);
			}
		} else {
			sb.append(", ");
			sb.append("Empty");
		}
		return sb.toString();
	}

}