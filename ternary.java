import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        // int number =5;
    
        // //ternary operator
        // String type=((number%2)==0)? "even" : "odd";
        // System.out.println(type);

        Scanner input=new Scanner(System.in);
        int marks=input.nextInt();
        String RC=(marks>=33)?"pass":"Fail";
        System.out.print(RC);
        input.close();
    }
}
