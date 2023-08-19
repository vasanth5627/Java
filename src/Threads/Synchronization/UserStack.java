package Threads.Synchronization;

import Java8.Streams.Temp;

import java.util.Arrays;

public class UserStack {
    private int[] arr;
    private int top;

    private int size=0;

    Object lock;

    public UserStack(int capacity) {
        this.arr = new int[capacity];
        this.top = -1;
        lock = new Object();
    }

    public UserStack() {
        this.arr = new int[10];
        this.top = -1;
        lock = new Object();
    }

    public synchronized boolean push(int x) throws InterruptedException{ //wraps entire method inside synchronized(this)
    //    synchronized (lock){
            if(size<arr.length){
                Thread.sleep(1000);
                arr[size++]  = x;
                top++;
                System.out.println("Push done");
                return true;
            }
            System.out.println("Stack is full");
            return false;
       // }

    }

    public synchronized int pop() throws InterruptedException{
      //  synchronized (lock){
            if(size>0){
                Thread.sleep(1000);
                int x = top--;
                size--;
                System.out.println("Pop done");
                return arr[x];
            }
            System.out.println("Pop Failed");
            return -1;
      //  }


    }

    public int peek(){
        return arr[top];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return this.size;
    }



    public void clear(){
        arr = new int[this.arr.length];
        this.size=0;
    }

    @Override
    public String toString() {
        StringBuilder s  = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            s.append(arr[i]+" ");
        }
        s.append("]");
        return s.toString();
    }
}
