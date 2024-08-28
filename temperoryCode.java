import java.util.*;
import java.lang.Math;
public class temperoryCode {
    public static int decTobin(int dec) {
        int bin=0;
        int pow=0;
        while (dec>0) {
            int rem=dec%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            dec/=2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=decTobin(n);
        System.out.println(num);
        sc.close();
    }
}
