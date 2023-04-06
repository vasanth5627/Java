package Strings;

public class SB {
    public static void main(String[] args) {
        String s = "";
        int n = 10000;
        long a  = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            s+=i;
        }
        long b = System.currentTimeMillis();
        long diffA = b-a;
        System.out.println(diffA);

        StringBuilder sb  = new StringBuilder();
        long c  = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append(i+"");
        }
        long d  = System.currentTimeMillis();
        long diffB = d-c;
        System.out.println(diffB);


    }
}
