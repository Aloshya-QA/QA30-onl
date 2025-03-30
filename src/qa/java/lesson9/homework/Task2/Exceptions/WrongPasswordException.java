package qa.java.lesson9.homework.Task2.Exceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        super("Invalid Password");
    }


}
