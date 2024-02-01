package GetSDEReady.Math;

public class ConvertToTitle {
    public static String convertTitle(int num){
        if(num<27){
            return (char)(num+64)+"";
        }
        StringBuilder sb = new StringBuilder();
        while(num>0){
            num--;
            sb.append((char)((num%26)+'A'));
            num/=26;
        }

       return sb.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(convertTitle(2147483647));
        System.out.println(convertTitle(701));
    }
}
