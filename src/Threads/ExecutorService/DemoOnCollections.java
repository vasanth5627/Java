package Threads.ExecutorService;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class DemoOnCollections {
    public static List<Product> createProducts(int num){
        List<Product> productList = new ArrayList<>();
        for (int i = num; i < num+100; i++) {
            Product p;
            if (i % 2 == 0) {
                p = Product.builder()
                        .id("test" + i)
                        .name("testProduct" + i)
                        .group("even")
                        .build();
            }
//            else if(i%3==0){
//                p = Product.builder()
//                        .id("test" + i)
//                        .name("testProduct" + i)
//                        .group("triple")
//                        .build();
//            }
//            else if(i%5==0){
//                p = Product.builder()
//                        .id("test" + i)
//                        .name("testProduct" + i)
//                        .group("fipple")
//                        .build();
//            }
            else {
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
    public static void main(String[] args) throws InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(
                100,
                new ThreadFactoryBuilder().setNameFormat("temp-%d").build()
        );

            List<Product> demoProducts = createProducts(0);

        //  List<Product> products = Collections.synchronizedList(new ArrayList<>());
           // CountDownLatch latch = new CountDownLatch(demoProducts.size());

        ConcurrentHashMap<String,List<Product>> products = new ConcurrentHashMap<>();

            for(Product product: demoProducts){
                executorService.submit(()->{
                    products.compute(product.getGroup(),(key,existingList)->{
                        if(existingList==null){
                            existingList = new CopyOnWriteArrayList<>();
                        }
                        existingList.add(product);
                        return existingList;
                    });


                });

            }

//
//            try {
//                latch.await(); // Wait for all threads to finish.
//
//            } catch (InterruptedException ignored) {
//            }


            try {
                executorService.shutdown();
                executorService.awaitTermination(1, TimeUnit.SECONDS);
            } catch (Exception ignored){}

        if(!products.isEmpty()){
            //Map<String,List<Product>> groupedProducts = products.stream().collect(Collectors.groupingBy(Product::getGroup));
            products.forEach((group,productList)->{
               batchSaveProducts(group,productList);

            });
            System.out.println(products.size());
            //System.out.println(groupedProducts.size());
            products.clear();
           // groupedProducts.clear();
        }





        }

    private static void batchSaveProducts(String group, List<Product> productList) {
        System.out.println(productList.size());
        productList.clear();
        System.out.println(productList.size());
    }


}
