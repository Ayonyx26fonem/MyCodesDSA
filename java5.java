//decimal to binary
import java.util.*;
public class java5 {
    public static int decTobin(int n){
        int pow=0;
        int binary=0;
        while(n>0){
            int remainder=n%2;
            binary=((binary)+remainder*((int)Math.pow(10,pow)));
            pow++;
            n/=2;
        }
        return binary;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(decTobin(n));

    }
}
