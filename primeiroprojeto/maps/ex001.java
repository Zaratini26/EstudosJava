package primeiroprojeto.maps;

import java.util.Map;
import java.util.TreeMap;

public class ex001 {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();


        cookies.put("Username", "Maria");
        cookies.put("Email", "maria@gmail.com");
        cookies.put("Phone", "911223458");

        cookies.remove("Phone");

        System.out.println("Contains (Email) in map: " + cookies.containsKey("Email"));
        System.out.println("Email: " + cookies.get("Email"));
        System.out.println("Phone number: " + cookies.get("Phone"));
        System.out.println("Size: " + cookies.size());

        System.out.println("\nAll Cookies:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}