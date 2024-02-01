package Threads.ExecutorService;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j
public class demoOnCollectionsTest {



        // Successfully creates a list of 1000 products with different groups
        @Test
        public void test_createProducts() {
            List<Product> products = DemoOnCollections.createProducts(0);
            assertEquals(1000, products.size());
            // Check if all products have different groups
            Set<String> groups = new HashSet<>();
            for (Product product : products) {
                groups.add(product.getGroup());
            }
            assertEquals(4, groups.size());
        }

        // Concurrently adds products to a ConcurrentHashMap grouped by their group attribute
        @Test
        public void test_concurrentAddToConcurrentHashMap() throws InterruptedException {
            ConcurrentHashMap<String, List<Product>> products = new ConcurrentHashMap<>();
            List<Product> demoProducts = DemoOnCollections.createProducts(0);
            ExecutorService executorService = Executors.newFixedThreadPool(100);


            for (Product product : demoProducts) {
                executorService.submit(() -> {
                    products.compute(product.getGroup(), (key, existingList) -> {
                        if (existingList == null) {
                            existingList = new CopyOnWriteArrayList<>();
                        }
                        existingList.add(product);

                        return existingList;
                    });
                });
            }


            try {
                executorService.shutdown();
                executorService.awaitTermination(1, TimeUnit.SECONDS);
            } catch (Exception ignored){}


            assertEquals(2, products.size());
            // Check if all products are added to the correct group
            for (List<Product> productList : products.values()) {
                assertEquals(50, productList.size());
            }
        }

        // Successfully prints the ConcurrentHashMap with the correct groupings and products
        @Test
        public void test_printConcurrentHashMap() {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            ConcurrentHashMap<String, List<Product>> products = new ConcurrentHashMap<>();
            List<Product> demoProducts = DemoOnCollections.createProducts(0);

            for (Product product : demoProducts) {
                products.compute(product.getGroup(), (key, existingList) -> {
                    if (existingList == null) {
                        existingList = new CopyOnWriteArrayList<>();
                    }
                    existingList.add(product);
                    return existingList;
                });
            }

           // DemoOnCollections.printConcurrentHashMap(products);

            String expectedOutput = "even -> [Product(id=test0, name=testProduct0, group=even), ...]\n" +
                    "triple -> [Product(id=test3, name=testProduct3, group=triple), ...]\n" +
                    "fipple -> [Product(id=test5, name=testProduct5, group=fipple), ...]\n" +
                    "odd -> [Product(id=test1, name=testProduct1, group=odd), ...]\n";
            assertEquals(expectedOutput, outContent.toString());
        }

        // Tests behavior when the createProducts method is called with a negative integer
        @Test
        public void test_createProducts_negativeInteger() {
            List<Product> products = DemoOnCollections.createProducts(-100);
            assertEquals(0, products.size());
        }

        // Tests behavior when the createProducts method is called with a large integer
        @Test
        public void test_createProducts_largeInteger() {
            List<Product> products = DemoOnCollections.createProducts(1000000);
            assertEquals(1000, products.size());
            // Check if all products have different groups
            Set<String> groups = new HashSet<>();
            for (Product product : products) {
                groups.add(product.getGroup());
            }
            assertEquals(4, groups.size());
        }

        // Tests behavior when the executorService is shutdown before all threads have completed
        @Test
        public void test_executorServiceShutdown() throws InterruptedException {
            ConcurrentHashMap<String, List<Product>> products = new ConcurrentHashMap<>();
            List<Product> demoProducts = DemoOnCollections.createProducts(0);
            ExecutorService executorService = Executors.newFixedThreadPool(100);

            for (Product product : demoProducts) {
                executorService.submit(() -> {
                    products.compute(product.getGroup(), (key, existingList) -> {
                        if (existingList == null) {
                            existingList = new CopyOnWriteArrayList<>();
                        }
                        existingList.add(product);
                        return existingList;
                    });
                });
            }

            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.SECONDS);

            assertEquals(4, products.size());
            // Check if some products are added to the correct group
            for (List<Product> productList : products.values()) {
                assertTrue(productList.size() > 0);
            }
        }

    }
