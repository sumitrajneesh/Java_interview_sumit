package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
//        10,20,30,45,67,89,76,67,89,20,45
        List<Integer> list = Arrays.asList(10,20,30,45,67,89,76,67,89,20,45);
        list.stream().filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet()).forEach(System.out:: println);

    }
}
