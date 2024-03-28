import java.util.Scanner;
public class uri1080 {
    public static void main (String []args){   
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int PosiçãoDoMaior = 1;

        for (int i=2; i<=100;i++){
            int MaiorNumero = sc.nextInt();
                if (MaiorNumero > N){
                    N = MaiorNumero;
                    PosiçãoDoMaior = i;
                }
        }
        System.out.println(N);
        System.out.println(PosiçãoDoMaior);

        sc.close();
    }
}