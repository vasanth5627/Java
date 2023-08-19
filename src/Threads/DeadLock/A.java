package Threads.DeadLock;

public class A {
    public synchronized void d1(B b) throws InterruptedException {
        System.out.println("Thread1 starts execution d1 method");
        Thread.sleep(1000);
        System.out.println("Thread1 is trying to call last method");
        b.last();
    }

    public synchronized void last(){
        System.out.println("Inside A last method");
    }

}
