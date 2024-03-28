import java.util.Scanner;

public class uri1132 {
	    public static void main (String []args){      
	    	Scanner sc = new Scanner(System.in);
	        
	        int X = sc.nextInt();
			int Y = sc.nextInt();

			int maior = X;
			int menor = Y;

			if (X < Y){
				maior = Y;
				menor = X;
			}
			int multiplos = 0;
			for(int i=menor;i<=maior;i++){
				 if (i%13!=0){
					multiplos = multiplos + i;
				 }

			}

			System.out.println(multiplos);
			sc.close();
		}
	}