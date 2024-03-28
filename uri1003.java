import java.util.Scanner;
public class uri1003 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, Soma;
		a = sc.nextInt();
		b = sc.nextInt();
		Soma = a + b;
		
		System.out.println("SOMA = " + Soma);
		sc.close();
	}
}