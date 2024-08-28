import java.util.*;

public class func6 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {// if true
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeinRange(n);
        sc.close();
    }
}
