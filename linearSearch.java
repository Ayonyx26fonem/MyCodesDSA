import java.util.*;

public class linearSearch {
    public static int ls(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int res = ls(arr, key);
        System.out.println(res);
        sc.close();
    }
}
