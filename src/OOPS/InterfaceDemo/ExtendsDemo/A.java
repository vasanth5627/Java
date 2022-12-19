package OOPS.InterfaceDemo.ExtendsDemo;

public interface A {
    void fun();
    default  void cry(){
        System.out.println("Crying");
    }
}
