package GetSDEReady.Math;

public class Factorial {
    public static long factorial(int num){
        long ans=1;
        while(num>0){
            ans*=num;
            num--;
        }
        return ans;
    }

    public static boolean isFactorial(int num){
        if(num%2==1) return false;
        int ans=1;
        int i=2;
        while(num>=ans){
            if(num==ans) return true;
            ans=ans*(i++);
        }
        return false;
    }

    

    public static void main(String[] args) {
        System.out.println(factorial(120));
        System.out.println(isFactorial(120));
    }
}
