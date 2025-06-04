package java8;

public class FindNonRepeated {
    public static void main(String[] args) {
        String input = "Java articles are awesome";

        Character res = input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst().orElse(null);

        System.out.println(res);
    }
}
