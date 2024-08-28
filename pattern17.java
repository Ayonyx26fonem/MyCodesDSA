import java.util.*;

public class pattern17 {
    public static void palindromic(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // for (int t = 2;  t<= i; t++) {
            //     System.out.print(t);
            // }
            System.out.println();
        }
    }    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        palindromic(n);
        in.close();
    }
}
