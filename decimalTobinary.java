import java.util.*;
import java.lang.Math;
public class decimalTobinary{
    public static int decTobin(int n) {
        int bin=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=decTobin(n);
        System.out.println(res);
        sc.close();
    }
}