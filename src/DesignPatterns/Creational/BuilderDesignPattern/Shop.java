package DesignPatterns.Creational.BuilderDesignPattern;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setProcessor("Oxy").setRam(2).getPhone();
        System.out.println(p);
    }
}
