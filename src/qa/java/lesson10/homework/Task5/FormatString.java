package qa.java.lesson10.homework.Task5;

public class FormatString {
    public static void main(String[] args) {
        formatString("Hello world!");
    }

    public static void formatString(String str) {
        char[] newStr = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char c : newStr) {
            if (c != ' ') {
                result.append(c);
                result.append(c);
            } else result.append(c);
        }

        System.out.println(result);
    }
}
