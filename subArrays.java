public class subArrays {
    public static void Sa(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        Sa(numbers);
    }
}
