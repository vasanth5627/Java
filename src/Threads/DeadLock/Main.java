package Threads.DeadLock;

public class Main {

    public static void main(String[] args) {
        Object lock;
        Object lock1;
        lock = new Object();
        lock1 = new Object();

        Thread t1 = new Thread(()->{
            synchronized (lock) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Lock acquired");

                synchronized (lock1) {
                    System.out.println("lock1 acquired");
                }
            }
        });



        Thread t2 = new Thread(()->{
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Lock acquired");

                synchronized (lock) {
                    System.out.println("lock1 acquired");
                }
            }
        });
        t1.start();
        t2.start();




    }

}
