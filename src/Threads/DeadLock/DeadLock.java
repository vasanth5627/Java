package Threads.DeadLock;

public class DeadLock extends Thread{
    A a  = new A();
    B b  = new B();

    public void m1() throws InterruptedException {
        this.start();
        a.d1(b);
    }
    public void run(){
        try {
            b.d2(a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        DeadLock d = new DeadLock();
        d.m1();
    }
}
