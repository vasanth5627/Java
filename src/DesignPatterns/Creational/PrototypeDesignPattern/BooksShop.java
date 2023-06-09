package DesignPatterns.Creational.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BooksShop implements Cloneable {
    private String shopName;
    private List<Book> books= new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBname("name "+i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BooksShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BooksShop clone() throws CloneNotSupportedException {
        BooksShop bs = new BooksShop();
        for(Book b : this.getBooks()){
            bs.getBooks().add(b);
        }
        return bs;
    }
}
