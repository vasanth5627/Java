package ArrayPrac.Greedy;

import java.util.Arrays;

public class BuyMaximumStockOnIthDay {
    static class Stock{
        int price;
        int day;

        public Stock(int price, int day) {
            this.price = price;
            this.day = day;
        }

        @Override
        public String toString() {
            return "Stock{" +
                    "price=" + price +
                    ", day=" + day +
                    '}';
        }
    }
    static int buyMaximumProducts(int[] price, int k){
        Stock[] arr = new Stock[price.length];
        for (int i = 0; i < price.length; i++) {
            arr[i] = new Stock(price[i],i+1);
        }

        Arrays.sort(arr, (a,b)->a.price-b.price);
        System.out.println(Arrays.toString(arr));
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(k>=arr[i].price){
               int times = arr[i].day;
               while(k>=arr[i].price && times>0){
                   profit+=arr[i].price;
                   k-=arr[i].price;
                   times--;
               }

            }
        }
        return profit;

    }

    public static void main(String[] args) {
        int[] price = {10,7,19};
        System.out.println(buyMaximumProducts(price,45));
    }
}
