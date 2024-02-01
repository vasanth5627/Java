package GetSDEReady.Math;

public class AlternativeDigitSum {
    public static int alternateSum(int num){
        int digits = (int) (Math.log10(num)+1);
        int init;
        if(digits%2==0){
           init=-1;
        }
        else{
            init=1;
        }
        int sum=0;
     while(num>0){
            int n = num%10;
            sum+=n*init;
            init*=-1;
            num/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(alternateSum(886996));
    }
}
