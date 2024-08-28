public class bubbleSort {
    public static void bsort(int arr[]) {
        int counter = 1;
        while (counter < arr.length) {
            for (int i = 0; i < arr.length - counter; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                counter++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + ",");
        }
    }

    public static void main(String[] args) {
        int n[] = { 8, 4, 2, 1, 5, 3 };
        bsort(n);
    }
}
