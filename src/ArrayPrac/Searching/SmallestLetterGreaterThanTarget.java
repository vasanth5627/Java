package ArrayPrac.Searching;

public class SmallestLetterGreaterThanTarget {
    public static char smallestLetterGreaterThanTarget(char[] letters, char target){
        if(letters[letters.length-1]<=target || letters[0]>target) return letters[0];
        int start =0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else if(letters[mid]<target){
                start = mid+1;
            }
            else{
                while(letters[mid+1]==letters[mid]) mid++;
                if(mid<letters.length) return letters[mid+1];
                else return letters[0];
            }
        }
        return letters[start];

    }
    public static char smallestLetterGreaterThanTarget1(char[] letters, char target) {
        if(letters[letters.length-1]<=target) return letters[0];
        char ch = 'a';
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(letters[mid]>target){
                ch = letters[mid];
                e= mid-1;
            }
            else{
                s=mid+1;

            }

        }
        return ch;
    }



    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(smallestLetterGreaterThanTarget(letters,'c'));
    }
}
