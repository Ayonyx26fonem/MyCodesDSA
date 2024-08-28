import java.util.*;

public class func5 {
    public static boolean isPrime(int n) {
        // boolean isPrime = true;
        // if (n==2) {
        //     return true;
        // }
        // only for n>=2
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // isPrime = false;
                // break;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(isPrime(n));
        if (isPrime(n)==true) {
            System.out.println("prime no");
        }
        else{
            System.out.println("not a prime num");
        }
        sc.close();

    }
}
