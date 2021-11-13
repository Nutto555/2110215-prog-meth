import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		try {
			x = sc.nextInt();
		} catch (Exception e){
			System.err.println("Oops!, something went wrong.");
			System.exit(0);
		}
		sc.close();
		if (x <= 200) {System.out.println("Your tax = " + 200) ;}
		else if (201 <= x && x <= 500 ) {System.out.println("Your tax = " + (200 + (x-200)*0.5));}
		else if (501 <= x && x <= 1000 ) {System.out.println("Your tax = " + (200 + 300*0.5 + (x-500)));}
		else if (1001 <= x) {System.out.println("Your tax = " + (200 + 300*0.5 + 500 + (x-1000)*2));}
	}

}