public class buySellStocks {
    public static int stocks(int arr[]) {
        int buyPrice=arr[0];
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            buyPrice=Math.min(buyPrice,arr[i]);
            int profit=arr[i]-buyPrice;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int n[]={7,1,5,3,6,4};
        System.out.println(stocks(n));
    }
}
