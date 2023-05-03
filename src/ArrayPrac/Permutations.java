package ArrayPrac;

public class Permutations {
    static void permutations(String s){
        int fact = fact(s.length());
        int count=0;
        for(int i=0;i<fact;i++){

            int l = s.length();
            StringBuilder sb = new StringBuilder(s);
            String str="";
            while(l>0){
                int temp = i%l;
                str+=sb.charAt(temp);
                sb.deleteCharAt(temp);
                l--;
            }
            System.out.println(str);
            count++;
        }
        System.out.println(count);
    }
    static int fact(int n){
        if(n==1 || n==0) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        permutations("abcd");
    }
}
