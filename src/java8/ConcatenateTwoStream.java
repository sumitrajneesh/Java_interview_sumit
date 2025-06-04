package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateTwoStream {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");


        Stream<String> concateStream = Stream.concat(list1.stream(), list2.stream());

        concateStream.forEach(str -> System.out.println(str + " "));
    }
}
