package Threads.DeadLock;

public class Dl {
    public static void main(String[] args) {
        Object lock = new Object();
        Object lock1  = new Object();

      new Thread(()->{
            synchronized (lock){
                System.out.println("lock acquired");
                try {
                    //we cannot guarantee deadlock if there is no sleep method
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("lock1 acquired");
                }
            }
        }).start();

       new Thread(()->{
            synchronized (lock1){
                System.out.println("lock1 acquired");
                synchronized (lock){
                    System.out.println("lock acquired");
                }
            }
        }).start();


    }
}
