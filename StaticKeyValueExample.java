package javalab;

import java.util.HashMap;
import java.util.Map;

public class StaticKeyValueExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<String, String> keyValueMap = new HashMap<>();

        // Static input - predefined key-value pairs
        keyValueMap.put("name", "srinath"+ "");
        keyValueMap.put("age", "24");
        keyValueMap.put("city", "hyderabad");

        // Display the key-value pairs
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, String> entry : keyValueMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

