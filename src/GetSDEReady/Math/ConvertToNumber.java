package GetSDEReady.Math;

public class ConvertToNumber {
    static int convertToNumber(String s){
        int ans=0;
        int p=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            int ascii = (int)(s.charAt(i)-64);
            ans+=ascii*Math.pow(26,p++);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(convertToNumber("ZY"));
    }
}
