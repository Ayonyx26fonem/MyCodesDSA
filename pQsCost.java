import java.util.*;
public class pQsCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost of pencil = ");
        float x=sc.nextFloat();
        System.out.print("Enter the cost of eraser = ");
        float y=sc.nextFloat();
        System.out.print("Enter the cost of the pen = ");
        float z=sc.nextFloat();
        float sum=(x+y+z);
        float gst=0.18f;
        float total=(sum*gst)+sum;
        System.out.print("Your total bill including tax is = "+total);
        sc.close();

    }
    
}
