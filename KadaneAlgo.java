public class KadaneAlgo {
    public static int kadane(int n[]) {
        int cs=0,ms=Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
        cs=cs+n[i];    
            if (cs<n[i]) {
                cs=n[i];
            }
            ms=Math.max(cs,ms);
        }
        return ms;
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        int y[]={-1,-2,-2,-3};
       System.out.println(kadane(num));
       System.out.print(kadane(y));
    }
    
}
