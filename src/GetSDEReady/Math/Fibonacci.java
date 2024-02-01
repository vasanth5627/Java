package GetSDEReady.Math;

public class Fibonacci {
    public static int fibonacci(int n){
        int a=0;
        int b=1;
        for(int i=2;i<n;i++){
            b = a+b;
            a= b-a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
