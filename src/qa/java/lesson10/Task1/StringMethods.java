package qa.java.lesson10.Task1;

public class StringMethods {
    public static void main(String[] args) {
        //Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
        //а y — это буква.
        printOnlyNums("1234asd3333dsa1q2w");
        getFormattedStr("1234abc3333dsa1q2w");
        printFormattedString("5554abc3333dsa1q2w");
        getFormattedString("5554abc3333dsa1q2w");
        containsSequence("5554abc3333dsa1q2w");
        startsWith("5554abc3333dsa1q2w");
        endsWith("5554abc3333dsa1q2w");
    }

    public static void printOnlyNums(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String result = stringBuilder.substring(0, 4) + stringBuilder.substring(7, 11);
        System.out.println(result);


    }

    public static void getFormattedStr(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String value = stringBuilder.substring(0, 4) + "***" + stringBuilder.substring(7, 11) + "***";
        System.out.println(value);

    }

    public static void printFormattedString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'a') {
                newStr.append(stringBuilder.charAt(i));
            } else if (stringBuilder.charAt(i) != stringBuilder.charAt(stringBuilder.length() - 1)) {
                if (stringBuilder.charAt(i) < 'a' && (stringBuilder.charAt(i + 1) > 57)) {
                    newStr.append('/');
                }
            }
        }
        newStr.deleteCharAt(0);
        System.out.println(newStr);
    }

    public static void getFormattedString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.toUpperCase());
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'a') {
                newStr.append(stringBuilder.charAt(i));
            } else if (stringBuilder.charAt(i) != stringBuilder.charAt(stringBuilder.length() - 1)) {
                if (stringBuilder.charAt(i) < 'a' && (stringBuilder.charAt(i + 1) > 57)) {
                    newStr.append('/');
                }
            }
        }
        newStr.deleteCharAt(0);
        System.out.println("Letters:" + newStr);
    }

    public static void containsSequence(String str) {
        String result = str.toLowerCase().contains("abc") ? "Contains 'ABC'" : "Does not contain 'ABC'";
        System.out.println(result);
    }

    public static void startsWith(String str) {
        String result = str.startsWith("555") ?
                "It starts with the sequence 555" :
                "Does not start with the sequence 555";

        System.out.println(result);
    }

    public static void endsWith(String str) {
        String result = str.endsWith("1a2b") ?
                "It ends with the sequence '1a2b'" :
                "Does not end with the sequence '1a2b'";

        System.out.println(result);
    }


}
