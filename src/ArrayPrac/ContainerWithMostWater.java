package ArrayPrac;

public class ContainerWithMostWater {
    static int containerWithMostWater(int[] arr){
        int i=0;
        int j=arr.length-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            max = Math.max(max, Math.min(arr[i],arr[j])*(j-i));
            if(arr[i]>arr[j]){
                j--;
            }
            else i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr= {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(arr));
    }
}
