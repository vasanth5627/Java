package ArrayPrac;

public class AsciiDiff {
    static String asciiDiff(String s){
        StringBuilder sb = new StringBuilder(s);
        int k=1;
        for(int i=1;i<s.length();i++){
            if(Character.isDefined(s.charAt(i))){
                int x = (int)(s.charAt(i)) - (int)s.charAt(i-1);
                sb.insert(k,x+"");
                if(x>0)
                k+=2;
                else k+=3;
            }

        }
        return sb.toString();
    }

    static String asciiDiff1(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int x = (int)(s.charAt(i)) - (int)s.charAt(i-1);
            sb.append(x);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(asciiDiff("abdgca"));
        System.out.println(asciiDiff1("abdgca"));
    }
}
