package qa.java.lesson3.homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        startInputMonth();
        startMonthInput();
        getParityOfNum();
    }

    public static int inputData() {
        return new Scanner(System.in).nextInt();
    }

//    1. Написать программу для вывода названия поры года по номеру месяца.
//    При решении используйте оператор switch-case.

    public static void startInputMonth() {
        System.out.print("Input month number: ");
        System.out.print("This month is " + getMonth(inputData()) + "\n");
    }

    public static String getMonth(int month) {

        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "not found";
        };
    }

//    2. Написать программу для вывода названия поры года по номеру месяца.
//    При решении используйте оператор if-else-if.

    public static void startMonthInput() {
        System.out.print("Input month number: ");
        int inputMonth = inputData();
        if ((inputMonth > 0 && inputMonth <= 2) || inputMonth == 12) {
            System.out.println("This month is Winter");
        } else if (inputMonth > 2 && inputMonth < 6) {
            System.out.println("This month is Spring");
        } else if (inputMonth > 5 && inputMonth < 9) {
            System.out.println("This month is Summer");
        } else if (inputMonth > 8 && inputMonth < 12) {
            System.out.println("This month is Autumn");
        } else
            System.out.println("Month is wrong");
    }

//    3. Напишите программу, которая будет принимать на вход число и на
//    выход будет выводить сообщение четное число или нет.
//    Для определения четности числа используйте операцию получения
//    остатка от деления - операция выглядит так: '% 2').

    public static void getParityOfNum() {

        System.out.println("Number is: ");
    }
}
