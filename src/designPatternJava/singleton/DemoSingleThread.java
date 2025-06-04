package designPatternJava.singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Sumit");
        Singleton singleton1 = Singleton.getInstance("Amit");
        System.out.println(singleton.value);
        System.out.println(singleton1.value);
    }
}
