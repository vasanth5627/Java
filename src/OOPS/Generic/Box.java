package OOPS.Generic;

public class Box<T> {
   T container;
   String name;

    public Box(T container, String name) {
        this.container = container;
        this.name = name;
    }

    public T getContainer() {
        return container;
    }

    public void setContainer(T container) {
        this.container = container;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    public Box(T container) {
//        this.container = container;
//    }
//
//    public T getContainer() {
//        return container;
//    }
//
//    public void setContainer(T container) {
//        this.container = container;
//    }
}
