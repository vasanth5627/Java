package DynamicProgramming;

public class Pzz {
    static void pzz(int n){
        if(n==0) return;
        System.out.println("Pre: "+n);
        pzz(n-1);
        System.out.println("In: "+n);
        pzz(n-1);
        System.out.println("Post: "+n);
    }

    static void pzz1(int n, String ans){
        if(n==0){
            return;
        }
        ans+= " Pre: "+n;
        pzz1(n-1,ans);
        ans+= " In: "+n;
        pzz1(n-1,ans);
        ans+= " Post: "+n;
        System.out.println(ans);
    }

    public static void main(String[] args) {
       pzz(2);
        pzz1(2,"");
    }
}
