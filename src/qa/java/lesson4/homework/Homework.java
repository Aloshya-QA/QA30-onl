package qa.java.lesson4.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        getResultOfSearch(createIntArray());
        startRemove(createIntArray());
        getMaxValue(createIntArray());
        getMinValue(createIntArray());
        getAvgValue(createIntArray());
        getBiggestAvgValue(createIntArray(), createIntArray());

        getEvenArray(createIntArray());
        // Чтобы просило длинну массива от 5 до 10,
        // нужно поменять условие (length > 0) в методе getIntArray
        // Не менял, так как метод используется не только здесь :)
        // Можно было бы написать новый,
        // но он бы не сильно отличался от getIntArray

        replaceOddIndexWithZero(createIntArray());
        sortArray();


    }

    public static int rangeRandom() {

        int start = 1;
        int end = 15;

        return new Random().nextInt((end - start) + 1) + start;
    }

    public static int[] createIntArray() {

        do {
            System.out.print("Do you want enter length array?(Y/N) \n");
            String answer = new Scanner(System.in).nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                return getIntArray();
            } else if (answer.equalsIgnoreCase("N")) {
                return getRandomIntArray();
            }
        } while (true);
    }

    public static int[] getIntArray() {

        System.out.print("Enter array length: ");

        try {
            int length = new Scanner(System.in).nextInt();

            if (length > 0) {
                int[] arrNums = new int[length];

                for (int i = 0; i < arrNums.length; i++) {
                    arrNums[i] = rangeRandom();
                }
                System.out.print("Created array: ");
                displayIntArray(arrNums);
                return arrNums;
            } else {

                System.out.println("Enter a number greater than 0");
                return getIntArray();
            }
        } catch (Exception e) {

            System.out.println("Enter numbers only, try again.");
            return getIntArray();
        }
    }

    public static int[] getRandomIntArray() {

        int[] arrNums = new int[rangeRandom()];

        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = rangeRandom();
        }

        System.out.print("Created array: ");
        displayIntArray(arrNums);
        return arrNums;
    }


    public static void displayIntArray(int[] array) {

        if (array.length != 0) {
            for (int i : array) {
                System.out.print(i + " ");
            }
        } else System.out.print("Empty");

        System.out.println();
    }

    public static void displayStringArray(String[] array) {

        if (array.length != 0) {
            for (String i : array) {
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
        displayIntArray(newArray);
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
        } else {
            System.out.println("The average value of the second array is greater");
        }
    }

    public static void replaceOddIndexWithZero(int[] oldArray) {

        for (int i = 1; i < oldArray.length; i += 2) {
            oldArray[i] = 0;
        }

        System.out.print("Modified array: ");
        displayIntArray(oldArray);
    }

    public static void createEvenArray(int removeNums, int[] oldArray) {

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
        displayIntArray(newArray);
    }

    public static void getEvenArray(int[] randomArray) {

        int counter = getCountOfEven(randomArray);

        if (counter > 0) {
            createEvenArray(counter, randomArray);
        } else {
            System.out.println("There are no even numbers in the array. Try again.");
            getEvenArray(createIntArray());
        }
    }

    public static void sortArray() {


        String[] array = createStringArray();

        System.out.print("Created string array: ");
        displayStringArray(array);

        System.out.print("Sorted string array: ");
        displayStringArray(bubbleSortStringArray(array));
    }

    public static String[] createStringArray() {

        System.out.print("Enter the length of the string array: ");
        int length = new Scanner(System.in).nextInt();

        if (length > 0) {
            String[] array = new String[length];

            for (int i = 0; i < array.length; i++) {
                System.out.print("Enter the value of the " + i + " element: ");
                array[i] = new Scanner(System.in).nextLine();
            }

            return array;
        } else {

            System.out.println("Enter a number greater than 0");
            return createStringArray();
        }
    }


    public static String[] bubbleSortStringArray(String[] array) {

        String prevNum;
        String nextNum;

        for (int cycle = 0; cycle < array.length; cycle++) {
            for (int prevIndex = 0, nextIndex = prevIndex + 1;
                 nextIndex < array.length - cycle;
                 prevIndex++, nextIndex++) {
                if (array[prevIndex].toLowerCase().charAt(0) > array[nextIndex].toLowerCase().charAt(0)) {
                    prevNum = array[prevIndex];
                    nextNum = array[nextIndex];
                    array[prevIndex] = nextNum;
                    array[nextIndex] = prevNum;
                }

            }
        }

        return array;
    }
}
