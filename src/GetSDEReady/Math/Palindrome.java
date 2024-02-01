package GetSDEReady.Math;

public class Palindrome {
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

    public static boolean palindrome(int num){
        int rev =  reverse(num);
        if(rev==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(100));
    }
}
