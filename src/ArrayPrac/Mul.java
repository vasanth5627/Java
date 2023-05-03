package ArrayPrac;

public class Mul {
    static int mul(int n1,int n2,int b){
        int c=0;
        int p=0;
        int sol =0;
        while(n1>0){
            int temp = n2*(n1%10)+c;
            c=0;
            if(temp>=b){
                c=temp/b;

            }
            sol+=(temp%b)*Math.pow(10,p);
            p++;
            n1/=10;
        }
        if(c>0){
            sol+=c*Math.pow(10,p);
        }
        return sol;
    }

    public static void main(String[] args) {
        System.out.println(mul(134,2,5));
    }

}
