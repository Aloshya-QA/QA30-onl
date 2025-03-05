package qa.java.lesson3.homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        startInputMonth();
        startMonthInput();
        getParityOfNum();
        getWeather();
        getRainbowColor();
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
        System.out.print("Input number: ");
        boolean inputNum = (inputData() % 2) == 0;
        System.out.println("Number is even: " + inputNum);

    }

//    4. Для введенного числа t (температура на улице) вывести
//    Если t>–5, то вывести «Тепло».
//    Если –5>= t > –20, то вывести «Нормально».
//    Если –20>= t, то вывести «Холодно».

    public static void getWeather() {
        System.out.print("Input temperature: ");
        int inputTemp = inputData();

        if (inputTemp > -5) {

            System.out.println("Weather is warm");

        } else if (inputTemp > -20) {

            System.out.println("Weather is fine");

        } else System.out.println("Weather is cold");
    }

//    5. По введенному номеру определить цвет радуги
//    (1 – красный, 4 – зеленый и т. д.).

    public static void getRainbowColor() {
        System.out.print("Input number of color: ");

        switch (inputData()) {
            case 1 -> System.out.println("Rainbow color is Red");
            case 2 -> System.out.println("Rainbow color is Orange");
            case 3 -> System.out.println("Rainbow color is Yellow");
            case 4 -> System.out.println("Rainbow color is Green");
            case 5 -> System.out.println("Rainbow color is Cyan");
            case 6 -> System.out.println("Rainbow color is Blue");
            case 7 -> System.out.println("Rainbow color is Purple");
            default -> System.out.println("Rainbow color is missing");
        }
    }



}
