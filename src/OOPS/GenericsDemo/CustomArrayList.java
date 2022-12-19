package OOPS.GenericsDemo;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private boolean isFull(){
        return size==data.length;
    }

    private void resize(){
        int[] temp = new int[data.length*2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int ind){
        return data[ind];
    }

    public int size(){
        return size;
    }

    public void set(int ind, int val){
        data[ind]=val;
    }
    public String toString(){
        int[] temp = Arrays.copyOfRange(data,0,size);
        return Arrays.toString(temp);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(10);
        list.add(0);
        System.out.println(list.get(2));
        list.remove();
        list.set(1,20);
        System.out.println(list.size());
        System.out.println(list);

    }
}
