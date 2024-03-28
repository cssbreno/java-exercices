import java.util.Scanner;

public class uri1004 {
	
	public static void main (String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int y, x, PROD;
		x = sc.nextInt();
		y = sc.nextInt();
		PROD = x * y;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}
}