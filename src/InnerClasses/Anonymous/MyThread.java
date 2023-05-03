package InnerClasses.Anonymous;

public class MyThread extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName() + " run " + i);
        }
    }

        public void m1(){
            for (int i = 0; i < 10; i++) {
                System.out.println(currentThread().getName()+" m1 "+i);
            }
        }


    public static void main(String[] args) {
        MyThread t = new MyThread();
       t.start(); // a new thread will run the run method
      //  t.run(); //main thread runs both run and main
    //   t.m1(); // main thread will run both m1 and main
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName()+" main "+i);
        }

        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(currentThread().getName()+" A.I.C "+i);
                }

            }
        };
        t1.start();


    }
}
