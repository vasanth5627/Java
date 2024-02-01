package Threads.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
       MyThread[] jobs  = {new MyThread("one"),new MyThread("two"),new MyThread("three"),
               new MyThread("four"),new MyThread("five")};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (MyThread job: jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}
