package GetSDEReady.Math;

public class PowerOf4 {
    public static boolean powerOf4(int num){
        if(num==1) return true;
        int ans = 1;
        while(Math.pow((double) 4,(double) ans)<=num){
            if(Math.pow((double) 4,(double) ans)==num){
                return true;
            }
            else{
                ans++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(powerOf4(1));
    }
}
