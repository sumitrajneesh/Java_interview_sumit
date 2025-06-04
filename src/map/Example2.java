package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.forEach((Key, Value) -> System.out.println(Key + "-> " + Value));

    }
}
