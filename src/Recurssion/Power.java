package Recurssion;

public class Power {
    static int power(int x, int n){
        if(n==0) return 1;
        int ans =1;
        while(n>0){
            ans*=x;
            n--;
        }
        return ans;
    }

    static int power1(int x, int n){
        if(n==0) return 1;
       int  ans  = x*power1(x,n-1);
        return ans;

    }

    static int power2(int x, int n){
        if(n==0) return 1;
        if(n%2==0) return power2(x,n/2)*power2(x,n/2);
        return x*power2(x,n/2)*power2(x,n/2);


    }

    static int power3(int x, int n){
        int ans = 1;
        while (n>0){
            if(n%2==1){
                ans*=x;
            }
            n=n/2;
            x*=x;
        }
        return ans;
    }

    static int power4(int x, int n){
        if(n==0) return 1;
         int ans = power2(x,n/2);
         ans*=ans;
         if(n%2==1) ans*=x;
        return ans;


    }


    public static void main(String[] args) {
        System.out.println(power4(2,10));
    }
}
