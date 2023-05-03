package ArrayPrac;

public class FreqOfDigit {
    static int freqOfDigit(int n,int k){
        int count=0;
        while(n>0){
            int curr = n%10;
            if(curr==k) count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int ans = freqOfDigit(2022,2);
        System.out.println(ans);
    }
}
