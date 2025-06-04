package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFlatmapExample {
    public static void main(String[] args) {
//        System.out.println("Student Activities : " + printStudentActivities());
        System.out.println("Unique Student Activities Count: " + getStudentActivitiesCount());


    }

    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream().map(Student :: getActivities)
                .flatMap(List :: stream)
                .collect(toList());
        return studentActivities;
    }

    public static long getStudentActivitiesCount() {
        long totalActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities).flatMap(List::stream).distinct().count();
        return totalActivities;
    }
}
