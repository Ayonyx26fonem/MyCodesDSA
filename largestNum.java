import java.util.Scanner;

public class largestNum {
    public static void larNum(int arr[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        larNum(arr);
        sc.close();
    }
}
