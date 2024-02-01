package Threads.ExecutorService;

import Threads.Communication.ThreadA;

    public class MyThread extends Thread{
    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+" job started by Thread: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" job completed by Thread: "+Thread.currentThread().getName());

    }
}
