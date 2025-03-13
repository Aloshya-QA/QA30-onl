package qa.java.lesson4.homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        getResultOfSearch(createRandomArray());
        startRemove(createRandomArray());

    }

    public static int[] createRandomArray() {

        System.out.print("Enter array length: ");
        int length = new Scanner(System.in).nextInt();
        int[] arrNums = new int[length];

        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = (int) (Math.random() * 10);
        }

        displayArray(arrNums);
        return arrNums;
    }

    public static void displayArray(int[] array) {

        System.out.print("Created array: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

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
