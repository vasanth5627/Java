package ArrayPrac;

import java.util.ArrayList;

public class RemovePrimesAL {
    static ArrayList<Integer> removePrime(ArrayList<Integer> al){
        int i=0;
        while(i<al.size()){
            if(isPrime(al.get(i))){
                al.remove(i);
            }
            else{
                i++;
            }
        }
        return al;
    }
    static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(10);
        al.add(2);
        al.add(5);
        al.add(22);
        al.add(37);
        al.add(18);

        System.out.println(removePrime(al));
    }
}
