package GetSDEReady.Math;

public class NumberOfZeroAtEnd {
    public static int numberOfZeroAtEnd(int num){
        int div = 5;
        int count = 0;
        while(div<=num){
            count+= num/div;
            div*=5;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfZeroAtEnd(25));
    }
}
