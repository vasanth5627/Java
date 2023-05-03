package InnerClasses.Anonymous;

import static java.lang.Thread.currentThread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + " run " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + " run " + i);
        }

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(currentThread().getName() + " run " + i);
                }
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
    }
}
