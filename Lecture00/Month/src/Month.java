import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month;
		System.out.println("Enter month number : ");
		int n = sc.nextInt();
		sc.close();
		switch (n) {
			case 1: 
				month = "January";
				break;
			case 2:
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month ="December";
				break;
			default:
				month = "Incorrect input.";
			}
		System.out.println(month);
	}

}
