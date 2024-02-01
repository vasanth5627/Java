package Threads.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    ReentrantLock l = new ReentrantLock();
    public  void wish(String name) throws InterruptedException {
        l.lock();
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");
            Thread.sleep(1000);
            System.out.println(name);
        }
        l.unlock();
    }
}
