package qa.java.lesson9.homework.Task2;

import static qa.java.lesson9.homework.Task2.Exceptions.UserValidation.validate;

public class Main {
    public static void main(String[] args) {
        System.out.println(validate("NewLogin", "Pass1234", "Pass1234"));
        System.out.println(validate("New Login", "Pass1234", "Pass1234"));
        System.out.println(validate("NewLogin", "Pass12345", "Pass1234"));
    }
}
