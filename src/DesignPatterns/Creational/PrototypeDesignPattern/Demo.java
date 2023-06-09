package DesignPatterns.Creational.PrototypeDesignPattern;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BooksShop bs = new BooksShop();
        bs.setShopName("vasanth");
        bs.loadData();
        System.out.println(bs);

        BooksShop bs1 = (BooksShop)bs.clone();
        bs1.setShopName("Kumar");

        System.out.println(bs1);



    }
}
