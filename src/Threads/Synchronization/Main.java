package Threads.Synchronization;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserStack st = new UserStack(100);
        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                try {
                    st.push(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();

        new Thread(()->{
            for (int i = 1; i < 10; i++) {
                try {
                    st.pop();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();

        Queue<Integer> q = new ArrayDeque<>();
        q= new PriorityQueue<>();
        q = new LinkedList<>();




    }

}
