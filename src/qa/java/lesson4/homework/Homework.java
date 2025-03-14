package qa.java.lesson4.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        getResultOfSearch(createArray());
//        startRemove(createArray());
//        getMaxValue(createArray());
//        getMinValue(createArray());
//        getAvgValue(createArray());
//        getBiggestAvgValue(createArray(), createArray());
//        replaceOddIndexWithZero(createArray());
//        createEvenArray(createArray()); fix range of array length



    }

    public static int rangeRandom() {

        int start = 1;
        int end = 15;

        return new Random().nextInt((end - start) + 1) + start;
    }


    public static int[] getArray() {

        System.out.print("Enter array length: ");

        try {
            int length = new Scanner(System.in).nextInt();

            if (length > 0) {
                int[] arrNums = new int[length];

                for (int i = 0; i < arrNums.length; i++) {
                    arrNums[i] = rangeRandom();
                }
                System.out.print("Created array: ");
                displayArray(arrNums);
                return arrNums;
            } else {

                System.out.println("Enter a number greater than 0");
                return getArray();
            }
        } catch (Exception e) {

            System.out.println("Enter numbers only, try again.");
            return getArray();
        }

    }

    public static int[] getRandomArray() {

        int[] arrNums = new int[rangeRandom()];

        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = rangeRandom();
        }

        System.out.print("Created array: ");
        displayArray(arrNums);
        return arrNums;
    }

    public static int[] createArray() {

        do {
            System.out.print("Do you want enter length array?(Y/N) \n");
            String answer = new Scanner(System.in).nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                return getArray();
            } else if (answer.equalsIgnoreCase("N")) {
                return getRandomArray();
            }
        } while (true);

    }

    public static void displayArray(int[] array) {

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

    public static int getCountOfEven(int[] randomArray) {

        int counter = 0;

        for (int num : randomArray) {
            if (num % 2 == 0) {
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
        System.out.print("New array: ");
        displayArray(newArray);

    }

    public static int getMaxValue(int[] array) {

        int cache = array[0];

        for (int j : array) {
            if (j > cache) {
                cache = j;
            }
        }
        System.out.println("Max value of array: " + cache);
        return cache;
    }

    public static int getMinValue(int[] array) {

        int cache = array[0];

        for (int j : array) {
            if (j < cache) {
                cache = j;
            }
        }

        System.out.println("Min value of array: " + cache);
        return cache;
    }

    public static double getAvgValue(int[] array) {

        int sumOfNums = 0;

        for (int i : array) {
            sumOfNums += i;
        }

        System.out.printf("Average value of array: %.2f \n", (double) sumOfNums / array.length);
        return (double) sumOfNums / array.length;
    }

//    public static String getBiggestAvgValue(int[] firstArray, int[] secondArray) {
//
//        int firstAvg = (int) getAvgValue(firstArray);
//        int secondAvg = (int) getAvgValue(secondArray);
//
//        return (firstAvg == secondAvg) ?
//                "The average values of the first and second array is equal" :
//                (firstAvg > secondAvg ?
//                "The average value of the first array is greater" :
//                "The average value of the second array is greater");
//    }

    public static void getBiggestAvgValue(int[] firstArray, int[] secondArray) {

        int firstAvg = (int) getAvgValue(firstArray);
        int secondAvg = (int) getAvgValue(secondArray);

        if (firstAvg == secondAvg) {
            System.out.println("The average values of the first and second array is equal");
        } else if (firstAvg > secondAvg) {
            System.out.println("The average value of the first array is greater");
        } else
            System.out.println("The average value of the second array is greater");

    }

    public static void replaceOddIndexWithZero(int[] oldArray) {

        int[] array = oldArray;

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.print("Modified array: ");
        displayArray(array);
    }

    public static void getEvenArray(int removeNums, int[] oldArray) {

        int newArrayLength = oldArray.length - removeNums;
        int[] newArray = new int[newArrayLength];

        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (oldArray[j] % 2 != 0) {
                newArray[i] = oldArray[j];
            } else {
                i--;
            }
        }
        System.out.print("New array without even nums: ");
        displayArray(newArray);

    }

    public static void createEvenArray(int[] randomArray) {

        int counter = getCountOfEven(randomArray);

        if (counter > 0) {
            getEvenArray(counter, randomArray);
        } else {
            System.out.println("There are no even numbers in the array. Try again.");
            createEvenArray(createArray());
        }

    }


}
