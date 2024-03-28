import java.util.Scanner;

import java.util.Locale;

public class uri1006 {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, MEDIA;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		MEDIA = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
		
		System.out.printf("MEDIA = " + "%.1f\n", MEDIA);
		
		sc.close();
	}
}