package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequency {

    public static void main(String[] args) {
        String inputString = "Java Concept of The Day";

        Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
    }
}
