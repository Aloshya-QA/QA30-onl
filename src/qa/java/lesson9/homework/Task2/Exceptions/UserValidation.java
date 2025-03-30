package qa.java.lesson9.homework.Task2.Exceptions;

public class UserValidation {
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("The username must be shorter than 20 characters and contain no spaces");
            }

            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
                throw new WrongPasswordException("The password must be shorter than 20 characters, contain no spaces, and contain at least one digit");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("The password and the password confirmation do not match");
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
