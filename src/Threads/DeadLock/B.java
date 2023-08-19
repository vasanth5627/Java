package Threads.DeadLock;

public class B {
    public synchronized void d2(A a) throws InterruptedException {
        System.out.println("Thread2 starts execution of d2() method");
        Thread.sleep(1000);
        System.out.println("Thread2 is trying to call last method");
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside B last method");
    }

}
