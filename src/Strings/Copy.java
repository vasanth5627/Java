package Strings;

public class Copy {
    
    int x = 30;
    public static void main(String[] args) {
        String s = "10";
        String k = "10";
        String i = new String("30");
        String j = new String("30");
        System.out.println(s==k);
        System.out.println(s.equals(k));
        System.out.println(i==k);
        System.out.println(i.equals(j));
        System.out.println(s+" "+k);
        System.out.println(i+" "+j);
        s="20";
        i="40";
        System.out.println(s+" "+k);
        System.out.println(s.equals(k));
        System.out.println(i+" "+j);
        System.out.println(i.equals(j));

        System.out.println("shallow vs deep");
        Copy c = new Copy();
        Copy d = c;
        d.x = 10;
        System.out.println(c.x);
        System.out.println(d.x);

        Copy e  = new Copy();
        Copy f  = new Copy();
        f.x = 40;
        System.out.println(e.x);
        System.out.println(f.x);

        String s1 = "vasanth";
        String s2 = "vasanth";
        String s3 = new String("vasanth");
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        s1="kumar";
        System.out.println(s1);
        System.out.println(s2);
        s1=s2;
        s2 = "kumar";
        System.out.println(s1);
        System.out.println(s2);
    }
}
