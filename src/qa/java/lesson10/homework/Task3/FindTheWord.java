package qa.java.lesson10.homework.Task3;

public class FindTheWord {
    public static void main(String[] args) {

        findTheWord("ffaff bf bbf bf abc aaa");
    }

    public static void findTheWord(String str) {
        String[] newStr = str.split(" ");

        int prevCounter = 0;
        int nextCounter = Integer.MAX_VALUE;
        int wordIndex = 0;

        for (int i = 0; i < newStr.length; i++) {
            for (int j = 0; j < newStr[i].length(); j++) {
                for (int l = 0; l < newStr[i].length(); l++) {
                    if (newStr[i].charAt(j) != newStr[i].charAt(l)) {
                        prevCounter++;
                    }
                }
            }

            if (prevCounter < nextCounter) {
                nextCounter = prevCounter;
                wordIndex = i;
            }

            prevCounter = 0;
        }

        System.out.println("A word in which the number of different characters is minimal: " + newStr[wordIndex]);
    }

}

