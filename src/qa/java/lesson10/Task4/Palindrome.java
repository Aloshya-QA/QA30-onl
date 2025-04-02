package qa.java.lesson10.Task4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        isPalindrome("Я иду с мечем судия");


    }

    public static void isPalindrome(String str) {
        String[] arrayStr = str.toLowerCase().split(" ");

        System.out.print("Enter the word number in the line: ");
        int index = new Scanner(System.in).nextInt() - 1;

        if (index >= arrayStr.length) {
            System.out.println("There are " + arrayStr.length + " words in a line!");
            return;
        }

        StringBuilder newStr = new StringBuilder(arrayStr[index]);

        String result = String.valueOf(newStr.reverse()).equals(arrayStr[index]) ?
                "The selected word '" + arrayStr[index] + "' in the string is a palindrome" :
                "The selected word '" + arrayStr[index] + "' in the string is not a palindrome.";

        System.out.println(result);

    }
}
