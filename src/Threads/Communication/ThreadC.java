package Threads.Communication;

public class ThreadC extends Thread{
    @Override
    public void run() {
        System.out.println("I'm not dependent");
    }
}
