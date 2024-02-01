package Threads.ReentrantLock;

public class ReentrantLockDemo1 {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t  = new MyThread(d,"vasanth");
        MyThread t1 = new MyThread(d,"kumar");
        t.start();
        t1.start();


    }
}
