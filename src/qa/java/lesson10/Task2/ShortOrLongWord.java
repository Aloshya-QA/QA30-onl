package qa.java.lesson10.Task2;

public class ShortOrLongWord {
    public static void main(String[] args) {

        printShortWord("fffff ab f 1234 jkjk b b n m");
        printLongWord("fffff ab f 1234 jkjkl b b n m");
    }

    public static void printLongWord(String str) {

        String[] arrayStr = str.split(" ");
        String result = arrayStr[0];

        for (String s : arrayStr) {
            if (result.length() <= s.length()) {
                result = s;
            }
        }

        System.out.println(result);
    }

    public static void printShortWord(String str) {

        String[] arrayStr = str.split(" ");
        String result = arrayStr[0];

        for (String s : arrayStr) {
            if (result.length() >= s.length()) {
                result = s;
            }
        }

        System.out.println(result);

    }
}
