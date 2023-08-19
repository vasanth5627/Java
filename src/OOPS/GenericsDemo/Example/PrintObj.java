package OOPS.GenericsDemo.Example;

public class PrintObj<T> {
    private T t;

    public PrintObj(T t) {
        this.t = t;
    }

    public void print(){
        System.out.println(this.t);
    }
}
