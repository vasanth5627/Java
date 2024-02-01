package Threads.ReentrantLock;

public class ReentrantDemo4 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        MyThread2 t1 = new MyThread2();
        t.start();
        t1.start();
    }
}
