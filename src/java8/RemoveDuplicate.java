package java8;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,34,12,5,6,7,6,9);

        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());

        System.out.println("uniqueList" +uniqueList);
    }
}
