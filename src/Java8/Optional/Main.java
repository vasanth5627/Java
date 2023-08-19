package Java8.Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<IllegalStateException> illegealState = () -> new IllegalStateException("IllegealState");
        Object o = Optional.ofNullable("ab ")
                .orElseThrow(illegealState);
        System.out.println(o);

        Optional.ofNullable(null)
                .ifPresentOrElse(System.out::println,()-> System.out.println("it is null"));
    }

}
