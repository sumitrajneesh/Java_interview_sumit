package map;

import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();

        HashMap<String, Integer> map2 = new HashMap<String, Integer>(30);

        HashMap<String, Integer> map3 = new HashMap<String, Integer>(30,0.5f);

        //creating hashmap by copying another HashMap

        HashMap<String, Integer> map4 = new HashMap<String, Integer>(map1);
    }
}
