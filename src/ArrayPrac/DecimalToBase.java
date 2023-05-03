package ArrayPrac;

public class DecimalToBase {
    static int decimaltoBase(int n,int b){
        int ans = 0;
        int i=0;
        while(n>0){
            int curr = n%b;
            ans = ans+(curr*(int)Math.pow(10,i));
            i++;
            n=n/b;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(decimaltoBase(3486,16));
    }
}
