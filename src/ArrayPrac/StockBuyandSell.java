package ArrayPrac;

public class StockBuyandSell {
    static int maxProfit(int[] arr){
        int maxProfit = 0;
        int buy = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<buy){
                buy=arr[i];
            }
            else{
                maxProfit = Math.max(maxProfit,arr[i]-buy);
            }
        }
        return maxProfit;
    }

    static int totalProfit(int[]arr){
        int tp=0;
        int buy = arr[0];

        for(int i=1;i<arr.length;i++){
           if(arr[i]>buy){
               tp+=arr[i]-buy;
               ;

           }
           else if(arr[i]<=buy){


           }
            buy=arr[i];
        }
        return tp;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
        System.out.println(totalProfit(new int[]{1,2,3,4,5}));
    }
}
