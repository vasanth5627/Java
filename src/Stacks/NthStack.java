package Stacks;

import java.lang.reflect.Array;
import java.util.Arrays;

class Valid{
    int x;
    int p;

    public Valid(int x,int p) {
        this.x = x;
        this.p = p;
    }

    @Override
    public String toString() {
        return "Valid{" +
                "x=" + x +
                ", p=" + p +
                '}';
    }
}
public class NthStack {
  private Valid[] arr;
  private  int t=0;

  private int s;

    public NthStack(int s){
        arr = new Valid[s];
        this.s = s;
    }

    public boolean push(int x, int m){
        if(t>=arr.length){
           // System.out.println(false);
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                arr[i] = new Valid(x,m);
                t++;
                return true;
            }
        }
       // System.out.println(false);
        return false;
    }

    public int pop(int m){
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]!=null && arr[i].p==m){
                int temp = arr[i].x;
                arr[i] = null;
                t--;
                return  temp;
            }
        }
        return -1;

    }

    public void printStack(){
        System.out.println(Arrays.toString(arr));
    }
    public int size(){
        return t;
    }

    public void printElements(){
        for (Valid v:
            arr ) {
            System.out.println(v.x+" "+v.p);

        }
    }
    public static void main(String[] args) {
        NthStack n = new NthStack(10);
        n.push(1,1);
        n.push(1,2);
        n.push(1,3);
        n.push(2,2);
        n.push(2,3);
        n.push(3,1);
        System.out.println(n.size());
        System.out.println(n.pop(1));
        System.out.println(n.pop(2));
        System.out.println(n.pop(1));
        System.out.println(n.pop(3));
        System.out.println(n.pop(1));
        System.out.println("size");
        System.out.println(n.size());
        n.push(1,1);
        n.push(1,2);
        n.push(1,3);
        n.push(2,2);
        n.push(2,3);
        n.push(3,1);
        n.push(1,1);
        n.push(1,2);
        n.push(1,3);
        n.push(2,2);
        n.push(2,3);
        n.push(3,1);

        n.printElements();


    }
}
