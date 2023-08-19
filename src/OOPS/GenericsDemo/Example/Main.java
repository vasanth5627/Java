package OOPS.GenericsDemo.Example;

public class Main {
    public static void main(String[] args) {
        PrintObj<Integer> p = new PrintObj<>(10);
        p.print();
        PrintObj<String> p1 = new PrintObj<>("abc");
        p1.print();

        Pair<Integer,Integer> pair = new Pair<>(10,20);
        pair.print();

    }
}
