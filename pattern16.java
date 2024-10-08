import java.util.*;

public class pattern16 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (n-i); j++) {
            System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                int res = (factorial(i)) / (factorial(k) * factorial(i - k));
                System.out.print(res + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
