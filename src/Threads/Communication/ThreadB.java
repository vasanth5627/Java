package Threads.Communication;

public class ThreadB extends Thread{
    int total=0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("child thread starts calculation");
            for (int i = 0; i <=1000000; i++) {
                total+=i;
            }
            System.out.println("child thread trying to give notification");
            this.notify();
        }

        System.out.println("I am still alive");

    }
}
