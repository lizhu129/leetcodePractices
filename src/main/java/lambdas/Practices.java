package lambdas;

import java.util.HashMap;
import java.util.Map;

public class Practices {
    static Map<String, String> map1 = Map.ofEntries(
            Map.entry("koala", "bamboo"),
            Map.entry("lion", "meat"),
            Map.entry("giraffe", "leaf"));

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map = Map.copyOf(map1);
        map.forEach((k, v) -> System.out.println(v));
        map.values().forEach(System.out::println);
        map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length()? v1 : v2;



    }



}
