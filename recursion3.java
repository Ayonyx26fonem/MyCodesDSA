//CHeck if the array is sorted or not 
public class recursion3 {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // first occurence of an element in an array
    public static int firstOccurence(int arr[], int i, int key) {
        if (i == arr.length)
            return -1;
        if (arr[i] == key)
            return i;
        return firstOccurence(arr, i + 1, key);
    }

    // last occurence of an element in an array
    public static int lastOccurence(int arr[], int i, int key) {
        if (i == arr.length)
            return -1;
        int ans = lastOccurence(arr, i + 1, key);
        if (ans == -1 && arr[i] == key) {
            return i;
        }
        return ans;
    }

    // X^n using recursion
    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        return x * power(x, n - 1); 
    }

    public static void main(String[] args) {
        int n[] = { 8, 2, 6, 9, 5, 10, 2, 5, 3 };

        // int t[]={2};
        // System.out.println(isSorted(n,0));
        System.out.println(lastOccurence(n, 0, 2));
        // System.out.println(power(2, 10));
    }
}