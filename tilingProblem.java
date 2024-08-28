public class tilingProblem {
    public static int numberOfWays(int n) {
        if (n==0||n==1) {
            return 1;
        }
        return numberOfWays(n-1)+numberOfWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println(numberOfWays(4));
    }
}
