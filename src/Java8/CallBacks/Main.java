package Java8.CallBacks;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> c = System.out::println;
        hello("vasanth",null,c);

    }

    static void hello(String firstName, String lastName, Consumer<String> consumer){
        System.out.println(firstName);
        if(lastName!=null){
            System.out.println(lastName);
        }
        else{
            consumer.accept(firstName);
        }
    }

}
