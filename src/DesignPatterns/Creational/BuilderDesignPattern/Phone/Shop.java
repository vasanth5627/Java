package DesignPatterns.Creational.BuilderDesignPattern.Phone;

import DesignPatterns.Creational.BuilderDesignPattern.Phone.Phone;
import DesignPatterns.Creational.BuilderDesignPattern.Phone.PhoneBuilder;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setProcessor("Oxy").setRam(2).getPhone();
        System.out.println(p);
    }
}
