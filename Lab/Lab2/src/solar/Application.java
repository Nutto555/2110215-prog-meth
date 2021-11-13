package solar;

import java.util.ArrayList;

public class Application {
	private static ArrayList<Planet> planets;

	public static String printPlanet(Planet planet) {
		if (planet instanceof Earth) {
			Earth e = (Earth) planet;
			return "Earth's Waste Level is " + e.getWasteLevel();
		} else if (planet instanceof Saturn) {
			Saturn s = (Saturn) planet;
			return "Saturn's Speed is " + s.getSpeed();
		}
		return "";
	}

	public static void main(String[] args) {
		Earth e = new Earth(1, 4);
		Saturn s = new Saturn(2, 2);
		planets = new ArrayList<>();
		planets.add(e);
		planets.add(s);
		for (Planet p : planets) {
			System.out.println(printPlanet(p));
		}
	}
}
