//binary to decimal
import java.util.*;
public class java4{
    public static int binaryTodec(int n){
        int pow=0;
        int decimal=0;
        while (n>0) {
            int lastDigit=n%10;
            decimal=decimal+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            n/=10;
        }
        return decimal;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(binaryTodec(n));
    }
}