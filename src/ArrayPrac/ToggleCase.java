package ArrayPrac;

public class ToggleCase {
    static String toggleCase(String s){
        StringBuilder sb = new StringBuilder(s);
//        System.out.println(sb);
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                sb.replace(i,i+1,Character.toLowerCase(s.charAt(i))+"");
//                System.out.println(sb);
            }
            else{
                sb.replace(i,i+1,Character.toUpperCase(s.charAt(i))+"");
//                System.out.println(sb);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggleCase("VaSanTH"));
    }
}
