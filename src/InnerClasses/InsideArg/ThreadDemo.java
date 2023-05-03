package InnerClasses.InsideArg;

import static java.lang.Thread.currentThread;

public class ThreadDemo {
    public static void main(String[] args) {
         new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(currentThread().getName() + " run " + i);
                }
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + " run " + i);
        }
    }
}
