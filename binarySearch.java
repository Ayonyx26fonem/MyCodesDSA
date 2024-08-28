import java.util.Scanner;

public class binarySearch {
    public static int bs(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int key=in.nextInt();
        int res=bs(arr,key);
        System.out.println(res);
        in.close();
    }
}
