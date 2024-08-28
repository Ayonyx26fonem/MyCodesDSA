import java.util.*;

public class func4 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int gp(int n, int r) {
        int nCr = factorial(n) / (factorial(r) * factorial(n - r));
        return nCr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int bc=gp(n,r);
        sc.close();
        System.out.println(bc);
        
    }

}