package GetSDEReady.Math;

import java.util.ArrayList;

public class PrimeFactors {
    public static boolean checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ((num % i) == 0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> printPrimeFactors(int num){
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        primes.add(2);
        int p=2;
        while(num>1){
            boolean div = false;
            for (int i = 0; i < primes.size(); i++) {
                if(num%primes.get(i)==0){
                    div=true;
                    num = num/primes.get(i);
                    ans.add(primes.get(i));
                    break;
                }
            }

            if(!div){
                p++;
                if(checkPrime(p)){
                    primes.add(p);
                }
            }
        }
        return ans;
    }

    public static void primeFactorization(int num){
        for (int i = 2; i*i <=num; i++) {
            while(num%i==0){
              num=num/i;
                System.out.print(i+" ");
            }
        }

        if(num!=1){
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        System.out.println(printPrimeFactors(1440));
        primeFactorization(1440);
    }
}
