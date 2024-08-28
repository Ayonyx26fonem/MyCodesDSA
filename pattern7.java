import java.util.*;

public class pattern7 {
    public static void hollow_rectangle(int rows, int col) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == rows || j == 1 || j == col) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        hollow_rectangle(n, t);
        sc.close();
    }
}
