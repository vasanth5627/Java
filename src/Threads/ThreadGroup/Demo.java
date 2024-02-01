package Threads.ThreadGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
//        ThreadGroup pg = new ThreadGroup("parent group");
//        ThreadGroup cg = new ThreadGroup(pg,"child group");
//        MyThread t1 = new MyThread(pg,"childThread1");
//        MyThread t2 = new MyThread(pg,"childThread2");
//        t1.start();
//        t2.start();
//        System.out.println(pg.activeCount());
//        System.out.println(pg.activeGroupCount());
//        pg.list();
//       // Thread.currentThread().getThreadGroup().interrupt();
//        Thread.sleep(10000);
//        System.out.println(pg.activeCount());
//        System.out.println(pg.activeGroupCount());

       Thread.currentThread().getThreadGroup().getParent().list();
        System.out.println();
        ThreadGroup system =  Thread.currentThread().getThreadGroup().getParent();
       Thread[] t = new Thread[system.activeCount()];
       system.enumerate(t);
        System.out.println(Arrays.toString(t));
        System.out.println();
        for (Thread th:t) {
            System.out.println(th.getName()+" "+th.isDaemon());
        }


    }
}
