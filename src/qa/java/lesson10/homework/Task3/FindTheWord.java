package qa.java.lesson10.homework.Task3;

public class FindTheWord {
    public static void main(String[] args) {
        findTheWord("fffff abbbbbb f 1234 jkjk");
    }

    public static void findTheWord(String str) {
        String[] newStr = str.split(" ");

        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < newStr.length; i++) {
            for (int j = 0; j < newStr[i].length(); j++) {
                for (int l = 0; l < newStr[i].length(); l++) {
                    if (newStr[i].charAt(j) == newStr[i].charAt(l)) {
                        counter++;
                    }
                }
                if (counter > counter2) {
                    counter2 = counter;
                }
                counter = 0;

            }
        }

        System.out.println(counter2);
    }

}

