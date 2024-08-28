import java.util.*;

public class pattern15 {
    public static void pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < (n - i+1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            } 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pyramid(n);
        in.close();
    }
}
