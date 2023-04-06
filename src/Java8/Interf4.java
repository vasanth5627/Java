package Java8;

public interface Interf4 {
    public static void main(String[] args) {
        System.out.println("Main Method inside Interface");
    }
    static void m1(){
        System.out.println("static method inside Interface");
    }

    default  void m2(){
        System.out.println("default void inside Interface");
    }

    static int m4(){
        return 10;
    }
    default int m5(){
        return 20;
    }


}
