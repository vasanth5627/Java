package DynamicProgramming;

public class Fibanocci {
    static int fibNormal(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int a=0;
        int b=1;
        int c =0;
        for (int i = 2; i <=n; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;

    }
    static int fibRec(int n){

        if(n==0) return 0;
        if(n==1||n==2) return 1;
        return fibRec(n-1)+fibRec(n-2);



    }
    static int fibDp(int n, int[]qb){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(qb[n]!=0){
            return qb[n];
        }
        int fibn = fibDp(n-1,qb)+fibDp(n-2,qb);
        qb[n] = fibn;
        return fibn;

    }
    static int fibIt(int n, int[] arr){
        if(n<=1)return n;
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-2]+arr[i-1];
        }
        return arr[n];
    }


    public static void main(String[] args) {
        System.out.println(fibNormal(10));
        System.out.println(fibRec(10));
        System.out.println(fibDp(10,new int[11]));
        System.out.println(fibIt(10,new int[11]));
       

    }
}
