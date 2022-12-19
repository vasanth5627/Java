package OOPS.GenericsDemo;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

        private Object[] data;
        private static int DEFAULT_SIZE=10;
        private int size=0;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

        public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

        private boolean isFull(){
        return size==data.length;
    }

        private void resize(){
        Object[] temp = new Object[data.length*2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data = temp;
    }

        public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

        public T get(int ind){
        return (T)(data[ind]);
    }

        public int size(){
        return size;
    }

        public void set(int ind, T val){
        data[ind]=val;
    }
        public String toString(){
        Object[] temp = Arrays.copyOfRange(data,0,size);
        return Arrays.toString(temp);
    }

        public static void main(String[] args) {
        CustomGenericArrayList<String> list = new CustomGenericArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        System.out.println(list.get(2));
        list.remove();
        list.set(1,"lmn");
        System.out.println(list.size());
        System.out.println(list);

    }

}
