package ArrayPrac;

public class Sort012 {
    static void sort012(int[] arr){
        int i=0;
        int j=0;
        int k= arr.length-1;
        while(j<k){
            if(arr[i]==1) i++;
            int temp = arr[i];
            if(arr[i]==0){
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else{
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }

    }

    public static void main(String[] args) {

    }
}
