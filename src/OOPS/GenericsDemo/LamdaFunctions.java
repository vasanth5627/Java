package OOPS.GenericsDemo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunctions{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }

        list.forEach((item)->{
            System.out.println(item*2);
        });

        Consumer<Integer> fun = (item)-> System.out.println(item*2);
        list.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;

        LamdaFunctions calc =  new LamdaFunctions();
        System.out.println(calc.operate(2,3,sum));
        System.out.println(calc.operate(2,3,sub));
        System.out.println(calc.operate(2,3,prod));


    }
//    int sum(int a, int b){
//        return a+b;
//    }

    private int operate(int a, int b, Operation operation){
        return operation.op(a,b);
    }
}

interface Operation{
    int op(int a, int b);
}
