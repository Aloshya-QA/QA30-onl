package qa.java.lesson9.homework.Task2.Exceptions;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
        super("Invalid Username");
    }


}
