package Java8;

public class Main implements Intef1,Interf4{
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    public void m3(){
        System.out.println("OverRiding default method");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.m3();
        m.m1();
        m.m2();
        Intef1.m4();
        Interf4.m4();
        int x = m.m5();
        System.out.println(x);


    }
}
