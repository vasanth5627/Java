package DynamicProgramming;

public class TOH {
    static void toh(int n, char A, char B, char C){
        if(n==0) return;
        toh(n-1,A,C,B); // source to dest using intermediate
        System.out.println(n+" -> "+A+" "+B);
        toh(n-1,C,B,A);  // source to dest using intermediate
    }

    public static void main(String[] args) {
        toh(4,'A','B','C');
    }
}
