package qa.java.lesson5.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

//        increaseArrayValues(createIntArray());
        getChessBoard(8, 8);

    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static int rangeRandom() {

        int start = 1;
        int end = 15;

        return new Random().nextInt((end - start) + 1) + start;
    }

    public static int[][][] createIntArray() {

        try {

            System.out.print("Enter the length of the first dimension of the array: ");
            int firstArraySize = input().nextInt();

            System.out.print("Enter the length of the second dimension of the array: ");
            int secondArraySize = input().nextInt();

            System.out.print("Enter the length of the third dimension of the array: ");
            int thirdArraySize = input().nextInt();

            if (firstArraySize > 0 && secondArraySize > 0 && thirdArraySize > 0) {

                int[][][] array = new int[firstArraySize][secondArraySize][thirdArraySize];

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        for (int k = 0; k < array[i][j].length; k++) {
                            array[i][j][k] = rangeRandom();
                        }
                    }
                }

                System.out.print("Created int array: ");
                displayIntArray(array);
                return array;
            } else {

                System.out.println("Length must be greater than zero, try again.");
                return createIntArray();
            }
        } catch (Exception e) {

            System.out.println("Enter numbers only, try again.");
            return createIntArray();
        }
    }

    public static void displayIntArray(int[][][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.println();
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
            }
        }
        System.out.println();
    }

    public static int[][][] increaseArrayValues(int[][][] array) {

        System.out.print("Enter what value to add: ");

        try {
            int value = input().nextInt();
            if (value > 0) {

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        for (int k = 0; k < array[i][j].length; k++) {
                            array[i][j][k] += value;
                        }
                    }
                }

                System.out.print("Increase int array: ");
                displayIntArray(array);
                return array;
            } else {

                System.out.println("The number must be greater than zero, try again.");
                return increaseArrayValues(array);
            }
        } catch (Exception e) {

            System.out.println("Enter numbers only, try again.");
            return increaseArrayValues(array);
        }

    }

    public static void getChessBoard(int firstLength, int secondLength) {

        String[][] array = new String[firstLength][secondLength];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        array[i][j] = "W";
                    } else {
                        array[i][j] = "B";
                    }
                } else {
                    if (j % 2 != 0) {
                        array[i][j] = "W";
                    } else {
                        array[i][j] = "B";
                    }
                }

            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
