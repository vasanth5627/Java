package Threads.ReentrantLock;

public class ReentrantDemo3 {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1("First Thread");
        MyThread1 t1 = new MyThread1("Second Thread");
        t.start();
        t1.start();
    }
}
