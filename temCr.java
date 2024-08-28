import java.util.*;
import java.lang.Math;
public class temCr {
    public static int binaryTodec(int bin) {
        int dec = 0;
        int pow = 0;
        while (bin > 0) {
            int lastDigit = bin % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            bin /= 10;
        }
        return dec;
        // for (int i = 1; i <= bin; i++) {
        //     int lastDigit=bin%10;
        //     dec=dec+(lastDigit*(int)Math.pow(2,i));
        //     bin/=10;
        // }
        // return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = binaryTodec(n);
        System.out.println(num);
        sc.close();
    }
}
