package qa.java.lesson4.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        getResultOfSearch(createArray());
        startRemove(createArray());

    }

    public static int rangeRandom() {

        int start = 1;
        int end = 15;

        return new Random().nextInt((end - start) + 1) + start;
    }


    public static int[] getArray() {

        System.out.print("Enter array length: ");
        int length = new Scanner(System.in).nextInt();
        int[] arrNums = new int[length];

        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = rangeRandom();
        }

        displayArray(arrNums);
        return arrNums;
    }

    public static int[] getRandomArray() {

        int[] arrNums = new int[rangeRandom()];

        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = rangeRandom();
        }

        displayArray(arrNums);
        return arrNums;
    }

    public static int[] createArray() {
        do {
            System.out.print("Do you want enter length array? \n");
            String answer = new Scanner(System.in).nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                return getArray();
            } else if (answer.equalsIgnoreCase("N")) {
                return getRandomArray();
            }
        } while (true);

    }

    public static void displayArray(int[] array) {

        System.out.print("Created array: ");

        if (array.length != 0) {
            for (int i : array) {
                System.out.print(i + " ");
            }
        } else System.out.print("Empty");

        System.out.println();

    }

    public static int getCountOfNums(int value, int[] randomArray) {

        int counter = 0;

        for (int num : randomArray) {
            if (num == value) {
                counter++;
            }
        }

        return counter;
    }

    public static void getResultOfSearch(int[] randomArray) {
        System.out.print("Enter the number you are looking for in the array: ");
        int counter = getCountOfNums(new Scanner(System.in).nextInt(), randomArray);

        if (counter > 0) {
            System.out.println("The number is contained in the array.");
        } else {
            System.out.println("Number is not found, try again.");
            getResultOfSearch(randomArray);
        }
    }

    public static void startRemove(int[] randomArray) {
        System.out.print("Enter the number you want to remove from the array: ");
        int value = new Scanner(System.in).nextInt();
        int counter = getCountOfNums(value, randomArray);

        if (counter > 0) {
            removeNums(counter, randomArray, value);
        } else {
            System.out.println("Number is not found, try again.");
            startRemove(randomArray);
        }
    }

    public static void removeNums(int removeNums, int[] oldArray, int value) {

        int newArrayLength = oldArray.length - removeNums;
        int[] newArray = new int[newArrayLength];

        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (oldArray[j] != value) {
                newArray[i] = oldArray[j];
            } else {
                i--;
            }
        }

        displayArray(newArray);

    }
}
