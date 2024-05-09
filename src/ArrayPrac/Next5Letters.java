package ArrayPrac;

import org.slf4j.Logger;

public class Next5Letters {
    public static String next5CapitalLetters(char ch){
        StringBuilder sb = new StringBuilder();
        int currentVal = ch;
        if(ch>96 && ch<123){
            if(currentVal+5>122){
                sb.append(getChars(currentVal,122-currentVal));
                sb.append(getChars(64,5-(122-currentVal)));
            }
            else{
                sb.append(getChars(currentVal,5));
            }
        }
        else if(ch>64 && ch<91){
            if(currentVal+5>90){
                sb.append(getChars(currentVal,90-currentVal));
                sb.append(getChars(96,5-(90-currentVal)));
            }
            else{
                sb.append(getChars(currentVal,5));
            }
        }
        else throw new IllegalArgumentException("Send valid character");
        return sb.toString();
    }

    private static  String getChars(int start, int range){
        StringBuilder sb = new StringBuilder();
        for (int i = start+1; i <=start+range ; i++) {
            sb.append((char)i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(next5CapitalLetters('z'));


    }
}
