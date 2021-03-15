package core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Location implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private List<Locatable> entities;
	private String name = null;

	public Location(int x, int y) {
		// TODO Auto-generated constructor stub
		this.setX(x);
		this.setY(y);
		entities = new ArrayList<Locatable>();
//		if ((y % 10) == 0)
//			System.out.println(x + "," + y + " .. ");
//		else
//			System.out.print(x + "," + y + " .. ");
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
		if (this.getName() == null)
			sb.append("Location");
		else
			sb.append(this.getName());
		sb.append(" (" + x + "," + y + ")");
//		if (entities.size() > 0) {
//			for (Locatable e : entities) {
//				sb.append(", ");
//				sb.append(e);
//			}
//		} else {
//			sb.append(", ");
//			sb.append("Empty");
//		}
		return sb.toString();
	}

	public void listEntities() {
		// TODO Auto-generated method stub
		for (Locatable e : entities) {
			System.out.println(e);
		}
	}

	public void removeEntity(Locatable entity) {
		// TODO Auto-generated method stub
		entities.remove(entity);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}