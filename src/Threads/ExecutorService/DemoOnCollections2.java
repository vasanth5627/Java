package Threads.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoOnCollections2 {
    private static List<Product> createProducts(){
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product p;
            if (i % 2 == 0) {
                p = Product.builder()
                        .id("test" + i)
                        .name("testProduct" + i)
                        .group("even")
                        .build();
            } else {
                p = Product.builder()
                        .id("test" + i)
                        .name("testProduct" + i)
                        .group("odd")
                        .build();

            }
            productList.add(p);
        }
        return productList;
    }
    public static void main(String[] args) {
        List<Product> productList = createProducts();
        Map<String,List<Product>> groupedProducts = productList.stream().collect(Collectors.groupingBy(Product::getGroup));
        groupedProducts.forEach((group,products)->{
            System.out.println(group+" -> "+products);
        });
        productList.clear();
        groupedProducts.clear();
        System.out.println(productList.size());
        System.out.println(groupedProducts.size());


    }
}
