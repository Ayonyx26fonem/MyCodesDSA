import java.util.*;

public class functions2 {
    public static int product(int num1, int num2) {
        int multiply = num1 * num2;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod= product(a, b);
        System.out.println(prod);
        sc.close();
    }

}
