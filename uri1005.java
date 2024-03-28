import java.util.Scanner;
import java.util.Locale;

public class uri1005 {
	public static void main (String[] args){
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, MEDIA;
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		MEDIA = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
		
		System.out.printf("MEDIA = " + "%.5f\n", MEDIA);
		
		sc.close();
	}
}