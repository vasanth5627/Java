package DesignPatterns.Creational.BuilderDesignPattern.DOG;

public class Test {
    private int id;
    private String name;


      class Inner{
        private int id;
        private String name;
    }

    static class Sinner{
        private int id;
        private String name;

        void display(){
            System.out.println("display");
        }
    }

}
