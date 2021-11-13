
public class Square {
	public static void main(String[] args) {
		int a, b, c;
		for (a = 0; a < 15; a++) {
			for (b = 0; b < 15; b++) {
				for (c = 0; c < 15; c++) {
					if (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) == 200) {
						System.out.println("a = " + a + "b =" + b + "c= " + c);
					}
				}
			}
		}
	}
}
