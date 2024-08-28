import java.util.Scanner;

public class java2 {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int a) {
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static int BC(int n, int r) {
        int binocoff = (factorial(n)) / (factorial(r)) * (factorial(n - r));
        return binocoff;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void PrimeinRange(int n){
        for(int i=2;i<=n;i++){
            if (isPrime(i)) {//kuch nahi likhe matlab true he hai
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int prod=multiply(a, b);
        // System.out.println(prod);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int facto = factorial(n);
        // System.out.println(facto);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // System.out.println(BC(n, r));

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrimeinRange(n);

    }
}
