package Java8;

public interface Intef1 {
    public void m1();
    public void m2();

    default void m3(){
        System.out.println("default method");
    }
    public  static void m4(){
        System.out.println("Interf static Method");
    }
}
