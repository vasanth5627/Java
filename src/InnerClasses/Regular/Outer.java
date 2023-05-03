package InnerClasses.Regular;

public class Outer {
    int x=10;
    static int y = 20;
    class Inner{
        public static void main(String[] args) {
            System.out.println("Inside Inner main");
        }
        int x= 30;
        static int z=0;

        public void m1(){
            int x =1000;
            System.out.println("Inner class method");
            System.out.println(x);
            System.out.println(y);
            System.out.println(this.x);
           // System.out.println(Inner.this.x);
            System.out.println(Outer.this.x);
        }
        public static void m4(){
            System.out.println("Static Inner Method");
        }
        class SubInner{
            public  void m5(){
                System.out.println("Nested Inner class");
            }
        }
    }
    public  void m2(){
        System.out.println("Outer Class Method");
        Inner i = new Inner();
        i.m1();
    }
    public static void m3(){
        System.out.println("Static outer Method");

    }

    public static void main(String[] args) {
        System.out.println("Outer class main method");
//        Outer o = new Outer();
//        Outer.Inner i = o.new Inner();
//        i.m1();
        Outer.Inner i = new Outer().new Inner();
        i.m1();
        Outer o = new Outer();
        o.m2();
        Outer.Inner.SubInner si = new Outer().new Inner().new SubInner();
        si.m5();
        Inner.main(new String[]{"hi"});


    }


}

class Test{
    public static void main(String[] args) {
        new Outer().new Inner().m1();
    }
}
