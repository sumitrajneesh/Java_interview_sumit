package map;

import java.util.HashMap;

public class Example3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("Two", 2);

        int value = map.get("Two");
        System.out.println(value);
    }
}
