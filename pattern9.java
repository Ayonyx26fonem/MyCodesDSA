import java.util.*;
public class pattern9 {
    public static void floyds(int n) {
        int g=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(g+" ");
                g++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        floyds(n);
    }
}
