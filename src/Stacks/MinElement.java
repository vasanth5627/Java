package Stacks;

import java.util.Stack;

public class MinElement {
    int min;
    Stack<Integer> st;

    public MinElement(int min, Stack<Integer> st) {
        this.min = Integer.MAX_VALUE;
        this.st = new Stack<>();
    }

    int getMin(){
      return min;
    }

    int pop(){
        if(st.peek()>min){
            return st.pop();
        }
        else{
            int temp = st.pop();
           min =  (2*min)-temp;
           return (temp+min)/2;
        }
    }

    void push(int m){
        if(st.size()==0){
            min = m;
            st.push(m);
        }
        else if(m<min){
              int t  = (2*m)-min;
               st.push(t);
               min = m;
        }
        else{
            st.push(m);
        }

    }

    public static void main(String[] args) {

    }
}
