import java.util.Locale;
import java.util.Scanner;

public class uri1116 {

	    public static void main (String []args){      
	        
	    	Locale.setDefault(Locale.US);
	    	Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        double media;

	        for (int i = 0; i<N; i++){
	            int a = sc.nextInt();
	            int b = sc.nextInt();

	            if (b != 0){
	                media = (double) a / b;
	                System.out.printf("%.1f\n", media);
	            }
	            else {
	                System.out.println("divisao impossivel");
	            }
	        }
	        sc.close();
	    }
	}
