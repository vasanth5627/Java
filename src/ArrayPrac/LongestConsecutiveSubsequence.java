package ArrayPrac;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveSubsequence {
    static int longestConSub(int[] arr){
        Arrays.sort(arr);
        int maxcount = 1;
        int currcount =1;
        int s = arr[0];
        for(int i=1; i< arr.length;i++){
            if(arr[i]==s+1){
                currcount++;

            }
            else if(arr[i]==s){
                continue;
            }
            else{
                maxcount = Math.max(currcount,maxcount);
                currcount=1;
            }
            s=arr[i];
        }
        return Math.max(currcount,maxcount);
    }

    static int longestConSubadv(int[] arr){
        int currcount=1;
        int maxcount=1;

        HashMap<Integer,Boolean> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],true);
        }
        System.out.println(hm);
        for(int i=0;i< hm.size();i++){
           if(hm.containsKey(arr[i]-1)){
               hm.put(arr[i],false);
           }
        }
        System.out.println(hm);

        for(int i=0;i<hm.size();i++){
            if(hm.get(arr[i])==true){
                int s = arr[i];
                while(hm.containsKey(s+1)){
                    s++;
                    currcount++;
                }
                maxcount= Math.max(currcount,maxcount);
                currcount=1;
            }
        }
        return Math.max(currcount,maxcount);



    }
    public static void main(String[] args) {
        int[] arr = {10,15,21,22,23,24};
        int ans = longestConSub(arr);
        System.out.println(ans);
        System.out.println(longestConSubadv(arr));


    }
}
