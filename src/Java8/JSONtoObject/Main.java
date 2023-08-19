package Java8.JSONtoObject;

import OOPS.InterfaceDemo.ExtendsDemo.A;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import net.minidev.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) throws IOException {
        //Object to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(100,"vasanth Kumar");
        Employee e2 = new Employee(101,"Rajesh");
        list.add(e1);
        list.add(e2);
        String json =  objectMapper.writeValueAsString(list);

        System.out.println(System.getProperties());
        objectMapper.writeValue(new File("abc.json"),list);
        System.out.println(json);

        //JSON to Object

        ObjectMapper objectMapper1 = new ObjectMapper();
        String jsonData = "[{\"id\":100,\"name\":\"vasanth Kumar\"},{\"id\":101,\"name\":\"Rajesh\"}]";
        ArrayList<Employee> list1 = objectMapper1.readValue(jsonData, new TypeReference<ArrayList<Employee>>() {});
        System.out.println(list1);
        list1.forEach(e-> System.out.println(e));
        String jsonData1 = "{\"id\":100,\"name\":\"vasanth Kumar\"},{\"id\":101,\"name\":\"Rajesh\"}";
        Map<String,String> hm = new HashMap<>();
        hm.put("a","A");

        JSONObject jsonObject = new JSONObject(hm);
        System.out.println(jsonObject.toString());


    }
}
