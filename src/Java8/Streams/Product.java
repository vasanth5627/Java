package Java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class Product {

    static List<Product> getProducts(){

        List<Product> el = new ArrayList<>();
        el.add(new Product(1,"Apple Laptop",90000f,"Laptop"));
        el.add(new Product(2,"Dell Laptop",70000f,"Laptop"));
        el.add(new Product(3,"HP Laptop",80000f,"Laptop"));
        el.add(new Product(4,"Acer Laptop",60000f,"Laptop"));
        el.add(new Product(5,"Honor Laptop",50000f,"Laptop"));
        el.add(new Product(6,"Lenovo Laptop",40000f,"Laptop"));
        el.add(new Product(7,"Acer Desktop",70000f,"Desktop"));
        el.add(new Product(8,"Honor Desktop",40000f,"Desktop"));
        el.add(new Product(9,"Lenovo Desktop",80000f,"Desktop"));

        return el;

    }
    private int id;
    private String product;
    private float price;

    private String type;

    public Product(int id, String product, float price, String type) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString(){
        return this.id+" "+this.product+" "+this.price+" "+this.type;
    }


}
