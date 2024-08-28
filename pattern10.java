import java.util.*;

public class pattern10 {
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * n - 2 * i); j++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= i; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half

        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * n - 2 * i); j++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= i; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        butterfly(n);
    }
}
