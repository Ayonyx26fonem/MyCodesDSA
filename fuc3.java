
//factorial
import java.util.*;

public class fuc3 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println(f);
        sc.close();
    }
}
