import java.util.*;
public class insertionSort {
    public static void iSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while ( prev >=0&&arr[prev] > curr  ) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
        }
        in.close();
        iSort(arr);
        for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[j] + " ");
        }
        // int n[] = { 7, 4, 8, 2, 1 };
        // iSort(n);
        // for(int i=0;i<n.length;i++){
        //     System.out.print(n[i]+" ");
        // }
    }
}