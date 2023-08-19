import java.util.Scanner;

public class Main {
    public static String  multiply1(String num1 ,  String num2){
        int i= num1.length()-1;
        long prod=1;
        long sum=0;
        while(i>=0){
            int a = num1.charAt(i)-'0';
            int b= num2.charAt(0)-'0';
            long p = (a*b)*prod;
            prod=prod*10;
            sum+=p;
            i--;
        }
        return sum+"";
    }

    public static String adds(String a , String b){
        if(b.length()==0) return a;
        if(a.length()==0) return b;
        StringBuffer sum= new StringBuffer("");
        int i = a.length()-1;
        int j = b.length()-1;
        long c=0;
        while(i>=0 && j>=0){
            long isum = a.charAt(i)-'0' + b.charAt(j)-'0' +c;
            sum.append(isum%10);
            c = isum/10;
            i--;
            j--;
        }
        while(i>=0){
            long isum = a.charAt(i)-'0'+c;
            sum.append(isum%10);
            c = isum/10;
            i--;
        }

        while(j>=0){
            long isum = b.charAt(j)-'0'+c;
            sum.append(isum%10);
            c = isum/10;
            j--;
        }
        if(c==1){
            sum.append("1");
        }
        return sum.reverse().toString();
    }

    public static String multiply(String a, String b){
        if(a.equals("0") || b.equals("0")) return "0";
        int i = b.length()-1;
        String ans="";
        String k="";
        while(i>=0){
          String cans=  multiply1(a, b.charAt(i)+"");
         cans = cans+k;
          ans=adds(cans, ans);
          i--;
          k+="0";
        }
        return ans;
    }

    public static void main(String[] args)
    {
//         String ans = multiply("15975363164662","9");
//         String ans1 = adds("52865748180","881095803");
//        System.out.println(ans);
//        System.out.println(ans1);

//        int i=0;
//        while(i<10){
//            new Thread(()->{
//                System.out.println("Hello Stranger");
//            }).start();
//            new Thread(()->{
//                System.out.println("I am Vasanth Kumar");
//            }).start();
//
//            new Thread(()->{
//                System.out.println("If you need me to code , let me know");
//            }).start();
//
//        //    Thread.sleep(1000);
//            i++;
//        }

       boolean b = true;
       //first label
        first:
        {
            //second
            second:
            {
                third:
                {
                    System.out.println("before the break statement");

                    if (b)
                        break second;
                    System.out.println("This would not be executed");
                }
                System.out.println("This would not be executed");

            }
            System.out.println("This is after second block");
        }

        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=3; j++) {
                if(i==2 && j==2){
                    continue;
                }
                System.out.println(i+" "+j);
                
            }

            
        }
        System.out.println("*************************");

        aa:
        for (int i = 1; i <=3; i++) {
            bb:
            for (int j = 1; j <=3; j++) {
                if(i==2 && j==2){
                    continue bb;
                }
                System.out.println(i+" "+j);

            }


        }

        int x =5;
        int y=10;
        System.out.println((y&1)==0);










    }
}
