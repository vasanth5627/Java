package GetSDEReady.Math;

public class Sqrt {
    public static int sqrt(int num){
        if(num==0 || num==1) return num;
        int s = 1;
        int e = num/2;
        while(s<=e){
           int mid = s+(e-s)/2;
           if(mid*mid==num){
               return mid;
           }
           else if(mid*mid>num){
               e=mid-1;
           }
           else{
               s=mid+1;
           }
        }
        return e;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(6));
    }
}
