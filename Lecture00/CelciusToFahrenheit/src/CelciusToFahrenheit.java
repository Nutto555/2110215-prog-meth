import java.util.Scanner;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature (Celcius): ");
		double c = sc.nextDouble();
		sc.close();
		double f = (c * 1.8) + 32;
		System.out.println("Temperature (Fahrenheit)= " + f);

	}

}
