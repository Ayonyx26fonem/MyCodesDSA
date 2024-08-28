public class prefixSumArray {
    public static void ps(int number[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int k = 0; k < prefix.length; k++) {
            for (int t = k; t < prefix.length; t++) {
                currSum = 0;
                currSum = k == 0 ? prefix[t] : prefix[t] - prefix[k - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int n[] = { 1, -2, 6, -1, 3 };
        int t[] = { 2, 4, 6, 8, 10 };
        ps(n);
        ps(t);
    }
}
