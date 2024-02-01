package Threads.ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread{
    static ReentrantLock l = new ReentrantLock();
    @Override
    public void run() {
        do{
            try {
                if (l.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " got the lock");
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + " release the lock");
                    l.unlock();
                    break;
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" waiting for lock");
                }
                } catch(InterruptedException e){
                    throw new RuntimeException(e);
                }


        }while (true);
    }
}
