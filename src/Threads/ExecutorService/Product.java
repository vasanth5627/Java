package Threads.ExecutorService;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
    private String id;
    private String name;
    private String group;

}
