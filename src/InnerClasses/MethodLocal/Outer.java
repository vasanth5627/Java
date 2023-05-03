package InnerClasses.MethodLocal;

public class Outer {
    int x=10;
    static int y=20;
    public  void m1(){
        int x=100;
        System.out.println("Inside outer m1 method");
        class Inner{
            public  void m2(){

                System.out.println(x+" "+y);
                System.out.println(new Outer().x);
                System.out.println("Inside inner m2 method");
            }


        }

        Inner i= new Inner();
        i.m2();

    }
    public static void m3(){
        class Inner{
            public void m2(){
                System.out.println(y);
                System.out.println("Static method inner class");
            }
        }
        Inner i = new Inner();
        i.m2();

    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.m1();

        m3();
    }
}
