package qa.java.lesson8.homework.Task2;

public class Start {
    public static void main(String[] args) {
        Printable accountant = new Accountant("Maxim", 24);
        Printable director = new Director("Zoe", 42);
        Printable worker = new Worker("David", 32);

        getPost(accountant, director, worker);
    }

    public static void getPost(Printable... objects) {
        for (Printable object : objects) {
            object.printPost();
        }

    }
}
