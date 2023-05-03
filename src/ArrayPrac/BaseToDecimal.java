package ArrayPrac;

import InnerClasses.NestedClass.Main;

public class BaseToDecimal {
    static int baseToDecimal(int n, int b){
        int p=0 ;
        int sol =0;
       while(n>0){
           sol+= (n%10)* Math.pow(b,p);
           p++;
           n=n/10;
       }
       return sol;
    }

    static int anyBaseToDecimal(String num, int b){
        if(b>16) return -1;
        if(b<10) {
            for (int i = 0; i < num.length(); i++) {

                if (Integer.parseInt(num.charAt(i) + "") >= b) {

                    return -1;
                }
            }
        }
        else{
            for (int i = 0; i < num.length(); i++) {
                if((int)num.charAt(i)>70){
                    return -1;
                }
                if((int)num.charAt(i)>=65 && (int)num.charAt(i)<=70){
                    if((int)num.charAt(i)-55>=b){
                        return -1;
                    }
                }            }
        }
        if(b<10){
            return baseToDecimal(Integer.parseInt(num),b);
        }
        else if(b==10){
            return Integer.parseInt(num);
        }
        else{
            int p=0;
            int sol=0;
            for(int i=num.length()-1;i>=0;i--){

                if(num.charAt(i)>='A' && num.charAt(i)<='F'){
                    sol+=(num.charAt(i)-55)*Math.pow(b,p);


                }
                else{
                    sol+=(num.charAt(i)-48)*Math.pow(b,p);

                }
                p++;
            }
            return sol;
        }
    }


    public static void main(String[] args) {
      //  System.out.println(baseToDecimal(1,16));
        System.out.println(anyBaseToDecimal("1AC",16));

    }
}
