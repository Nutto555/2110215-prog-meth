import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		try {
			x = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Oops!, something went wrong.");
			System.exit(0);
		}
		sc.close();
		if (-10 <= x && x <= -5) { System.out.println(-Math.pow(x, 2));}
		else if (-5 < x && x <= 0) {System.out.println(0);}
		else if (0 < x && x <= 5) {System.out.println(Math.pow(x, 2));}
		else if (5 < x && x <= 10) {System.out.println(0);}
		else if (10 < x || x < -10) {System.out.println(Math.pow(x, 3));}
	}
}