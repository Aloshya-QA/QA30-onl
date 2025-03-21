package qa.java.lesson5.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        increaseArrayValues(createIntArray());
        getChessBoard(8, 8);

//        getMatrix(createArray(), createArray());
        getMatrix(
                new int[][]{{1, 0, 0, 0},
                        {0, 1, 0, 0},
                        {0, 0, 0, 0}},

                new int[][]{{1, 2, 3},
                        {1, 1, 1},
                        {0, 0, 0},
                        {2, 1, 0}}
        );

        getArraySum(createArray());
        getArrayDiagonal(createArray());



    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static int rangeRandom() {

        int start = 1;
        int end = 9;

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

    public static int[][] createArray() {

        try {

            System.out.print("Enter the length of the first dimension of the array: ");
            int firstArraySize = input().nextInt();

            System.out.print("Enter the length of the second dimension of the array: ");
            int secondArraySize = input().nextInt();

            if (firstArraySize > 0 && secondArraySize > 0) {

                int[][] array = new int[firstArraySize][secondArraySize];

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = rangeRandom();

                    }
                }

                System.out.print("Created int array: ");
                displayArray(array);
                return array;
            } else {

                System.out.println("Length must be greater than zero, try again.");
                return createArray();
            }
        } catch (Exception e) {

            System.out.println("Enter numbers only, try again.");
            return createArray();
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

    public static void displayArray(int[][] array) {

        for (int[] i : array) {
            System.out.println();
            for (int j : i) {
                System.out.print(j + " ");

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

    public static void getArraySum(int[][] array) {

        int result = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                result += anInt;
            }
        }

        System.out.print("Sum of array values: " + result);
    }

    public static void getArrayDiagonal(int[][] array) {

        System.out.println("\n");
        System.out.print("Diagonals of the array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == ((array.length - 1) - i)) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }

    public static int[][] getMatrix(int[][] firstArray, int[][] secondArray) {

        if (firstArray.length == secondArray.length) {

            int[][] matrixArray = new int[firstArray.length][firstArray.length];

            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < firstArray[i].length; j++) {
                    for (int k = 0; k < firstArray.length; k++) {
                        matrixArray[i][j] += firstArray[i][k] * secondArray[k][j];

                    }
                }
            }

            System.out.print("Matrix: ");
            displayArray(matrixArray);
            return matrixArray;

        } else if ((firstArray.length == secondArray[0].length) && (firstArray.length > secondArray.length)) {

            int[][] matrixArr = new int[firstArray.length][firstArray.length];

            firstArray = expandArray(firstArray, firstArray.length);
            secondArray = expandArray(secondArray, firstArray.length);

            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < firstArray[i].length; j++) {
                    for (int k = 0; k < firstArray.length; k++) {
                        matrixArr[i][j] += firstArray[i][k] * secondArray[k][j];

                    }
                }
            }
            System.out.print("Matrix: ");
            displayArray(matrixArr);
            return matrixArr;

        } else if ((firstArray[0].length == secondArray.length)) {

            int length = firstArray.length;

            int[][] matrixAr = new int[secondArray.length][secondArray.length];

            firstArray = expandArray(firstArray, secondArray.length);
            secondArray = expandArray(secondArray, secondArray.length);

            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < firstArray[i].length; j++) {
                    for (int k = 0; k < firstArray.length; k++) {
                        matrixAr[i][j] += firstArray[i][k] * secondArray[k][j];

                    }
                }
            }

            System.out.print("Matrix: ");
            displayArray(compressArray(matrixAr, length));

            return compressArray(matrixAr, length);

        } else {

            System.out.println("The number of columns of the first matrix " +
                    "must be equal to the number of rows of the second matrix." +
                    " Try again.");
            return getMatrix(createArray(), createArray());
        }
    }

    public static int[][] expandArray(int[][] array, int length) {

        int[][] newArray = new int[length][length];

        if (array.length == length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    newArray[i][j] = array[i][j];
                }

            }
        } else {
            for (int i = 0; i < array[0].length; i++) {
                for (int j = 0; j < array.length; j++) {
                    newArray[j][i] = array[j][i];
                }
            }
        }
        return newArray;
    }

    public static int[][] compressArray(int[][] array, int length) {

        int[][] newArray = new int[length][length];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                newArray[i][j] = array[i][j];

            }

        }

        return newArray;
    }
}