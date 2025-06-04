package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {


    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream().reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> performanceMultiplicationWithNoInitialValue(List<Integer> integerList) {
        return integerList.stream().reduce((a,b) -> a*b); //perform multiplication for each element in the stream and returns a new result fo.
    }

    public static String combineStudentNames() {
        return StudentDataBase.getAllStudents().stream().map(Student::getName)
                .distinct()
                .reduce("", (a,b) -> a.concat(b));
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);

        System.out.println("Result is : " +performMultiplication(integerList));

    }
}
