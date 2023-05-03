package ArrayPrac;

public class AnyBaseMul {
    static int anyBaseMul(int n1, int n2, int b){
        int sol =0;
        int p=0;
        while(n2>0){
            int temp = Mul.mul(n1,n2%10,b);
            sol+=temp*Math.pow(10,p);
            p++;
            n2/=10;
        }
        return sol;
    }

    public static void main(String[] args) {
        System.out.println(anyBaseMul(1220,31,5));
    }



}
