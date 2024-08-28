//problem rain water
public class TrappinRainWater {
    public static int TrappedrainWater(int heights[]) {
        int n = heights.length;
        int leftMax[] = new int[n];
        //calculating leftmax boundary in form of array
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1]=heights[n-1];
        //calculating rightmax boundary in form of array
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        //finding the amount of trapped rainwater
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - heights[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int nums[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrappedrainWater(nums));
    }
}
//int n=new int[]
/*for(int i=0;i<n;i++){
    n[i]=in.nextInt();
} */