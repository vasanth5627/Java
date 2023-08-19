package Threads.Communication;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        b.start();
        c.start();
        synchronized (b){
            System.out.println("Main thread is trying to call wait method");
            b.wait(10);
            System.out.println("Main thread got notification");
            System.out.println(b.total);
        }


    }
}
