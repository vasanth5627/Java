package Threads.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    static ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+" got the lock and performing safe operations");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.unlock();
        }
        else{
            System.out.println(Thread.currentThread().getName()+" did not get the lock");
        }
    }
}
