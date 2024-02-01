package GetSDEReady.Math;

public class SieveOfEratosthenes {
    public static void sieveOfEratosthenes(int num){
        boolean[] arr = new boolean[num+1];
        for (int i = 2; i*i <=num; i++) {
            if(arr[i]==false){
                for (int j = i*i; j<=num; j=j+i) {
                    arr[j]=true;
                }
            }
        }

        for (int i = 2; i <arr.length; i++) {
            if(arr[i]==false) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        sieveOfEratosthenes(100);
    }
}
