
//practice questions #1
import java.util.*;

public class RIPdump {
    public static void main(String[] args) {
        System.out.print("Enter three numbers = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int avg=((a+b+c)/3);
        System.out.println(avg);
        sc.close();
    }
}
