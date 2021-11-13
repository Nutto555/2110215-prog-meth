package solar;

import java.util.Objects;

public class Planet {
	protected Coordinate coordinate;
	protected Coordinate orbitCenterCoordinate;
	protected int orbitRadius;

	public Planet() {
		coordinate = new Coordinate();
		orbitCenterCoordinate = new Coordinate();
		orbitRadius = 1;
		coordinate.setX(1);
		coordinate.setY(0);
	}

	public Planet(int orbitRadius) {
		coordinate = new Coordinate();
		orbitCenterCoordinate = new Coordinate();
		if (orbitRadius < 1) {
			orbitRadius = 1;
		}
		this.orbitRadius = orbitRadius;
		coordinate.setX(orbitRadius);
		coordinate.setY(0);
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public Coordinate getOrbitCenterCoordinate() {
		return orbitCenterCoordinate;
	}

	public int getOrbitRadius() {
		return orbitRadius;
	}

	public boolean orbit() {
		int x = getCoordinate().getX();
		int y = getCoordinate().getY();
		int cen_x = getOrbitCenterCoordinate().getX();
		int cen_y = getOrbitCenterCoordinate().getY();
		if (x == cen_x+orbitRadius && y == cen_y) {
			getCoordinate().setX(cen_x);
			getCoordinate().setY(-orbitRadius);
			return true;
		} else if (x == cen_x && y == cen_y-orbitRadius) {
			getCoordinate().setX(-orbitRadius);
			getCoordinate().setY(cen_y);
			return true;
		} else if (x == cen_x-orbitRadius && y == cen_y) {
			getCoordinate().setX(cen_x);
			getCoordinate().setY(orbitRadius);
			return true;
		} else if (x == cen_x && y == cen_y+orbitRadius) {
			getCoordinate().setX(orbitRadius);
			getCoordinate().setY(cen_y);
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		return Objects.equals(orbitCenterCoordinate, other.orbitCenterCoordinate);
	}
}
