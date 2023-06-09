package ArrayPrac.Greedy;

public class MinimumDays {
    static int minimumDays(int S, int N, int M){
        int totalBuy = S-(S/7);
        int total = totalBuy*M;
        int maxTotal = totalBuy*N;
        if(maxTotal<total) return -1;
        int count=0;
        int t = S*M;
        while(t>0){
            t-=N;
            count++;
        }
        return count>totalBuy?-1:count;
    }

    public static void main(String[] args) {
        System.out.println(minimumDays(49,16,16));
    }
}
