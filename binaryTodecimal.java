import java.util.*;
import java.lang.Math;

public class binaryTodecimal {
    // public static void b2d(int n) {
    //     for (int i = 0; i <= n; i++) {
    //         int ld = n % 10;
    //         double decimalNum = ld * ((int) Math.pow(2, i));
    //         n /= 10;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int num = b2d(n);
    //     System.out.println(num);
    //     sc.close();
    // }

    public static void binTodec(int binNum) {
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while (binNum>0) {
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum/=10;
        }
        System.out.println("decimal of "+myNum+" = "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binTodec(n);
        sc.close();   
    }
}
