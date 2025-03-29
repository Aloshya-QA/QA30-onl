package qa.java.lesson8.homework.Task2;

public class Director implements Printable {
    private final String name;
    private final int age;

    public Director(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printPost() {
        System.out.println(name + " is a Director");
    }
}
