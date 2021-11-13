
public class Pythagoras {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		System.out.println("Base = " + a * Math.cos(Math.toRadians(b)));
		System.out.println("Height = " + a * Math.sin(Math.toRadians(b)));
		
	}

}
