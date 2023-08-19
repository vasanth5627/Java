package Threads.Synchronization.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class BlockedQueue {
    private Queue<Integer> q;
    private int capacity;

    public BlockedQueue(int capacity) {
        this.q = new LinkedList<>();
        this.capacity = capacity;

    }

    public void produce(int x) throws InterruptedException {
        synchronized (q){
            while (q.size()==capacity){
                q.wait();
            }

                q.add(x);
                System.out.println(x+" produced");
                q.notifyAll();


        }

    }

    public void consume() throws InterruptedException {
        synchronized (q){
            while(q.size()==0){
                q.wait();
            }
                int x =  q.poll();
                System.out.println(x+" consumed");
                q.notifyAll();

            }


        }





}
