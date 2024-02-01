package GetSDEReady.Math;

public class ReverseNumber {
    public static int reverse(int num){
        boolean negative  = false;
        if(num<0){
            negative = true;
            num*=-1;
        }

        if(num<10) return num;
        int ans = 0;
        while(num>0){
            int lastDigit = num%10;
            ans = (ans*10)+lastDigit;
            num/=10;
        }
        if(negative) return -ans;
        return ans;
    }

    public static int lCodeReverse(int x){
        if(x>0){
            if(x<10) return x;
            x = lReverse(x);
            return x;
        }
        if(x>-10){
            return x;
        }
        x = -x;
        x = lReverse(x);
        return -x;
    }

    private static int lReverse(int x) {
        long rev=0;
        while(x>0){
            rev = (rev*10)+(x%10);
            x/=10;
        }
        return rev>Integer.MAX_VALUE?0:-rev<Integer.MIN_VALUE?0:(int)rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-100));
        System.out.println(lCodeReverse(-100));
    }
}
