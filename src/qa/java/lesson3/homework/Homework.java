package qa.java.lesson3.homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        startInputMonth();
        startMonthInput();
        getParityOfNum();
        getWeather();
        getRainbowColor();
        getOddNum();
        getNum();
        getSum();
        getStringOfNum();
        getNumString();
        getSquare();
        getFibonacci();
        getInvestment();
        getMultiTable();
    }

    public static int getData() {
        return new Scanner(System.in).nextInt();
    }

//    1. Написать программу для вывода названия поры года по номеру месяца.
//    При решении используйте оператор switch-case.

    public static void startInputMonth() {
        System.out.print("Enter month number: ");
        System.out.print("This month is " + getMonth(getData()) + "\n");
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
        System.out.print("Enter month number: ");
        int inputMonth = getData();
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
        System.out.print("Enter number: ");
        boolean inputNum = (getData() % 2) == 0;
        System.out.println("Number is even: " + inputNum);

    }

//    4. Для введенного числа t (температура на улице) вывести
//    Если t>–5, то вывести «Тепло».
//    Если –5>= t > –20, то вывести «Нормально».
//    Если –20>= t, то вывести «Холодно».

    public static void getWeather() {
        System.out.print("Enter temperature: ");
        int inputTemp = getData();

        if (inputTemp > -5) {

            System.out.println("Weather is warm");

        } else if (inputTemp > -20) {

            System.out.println("Weather is fine");

        } else System.out.println("Weather is cold");
    }

//    5. По введенному номеру определить цвет радуги
//    (1 – красный, 4 – зеленый и т. д.).

    public static void getRainbowColor() {
        System.out.print("Enter number of color: ");

        switch (getData()) {
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

//    1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
//    При решении используйте операцию инкремента (++).

    public static void getOddNum() {

        System.out.print("Odd numbers from 1 to 99: ");

        for (int i = 1; i < 100; i++) {

            if (i < 99) {
                System.out.print(i + ", ");
                i += 1;
            } else {
                System.out.println(i + ".");
            }
        }
    }

//   2. Необходимо вывести на экран числа от 5 до 1.
//   При решении используйте операцию декремента (--).

    public static void getNum() {

        System.out.print("Numbers from 5 to 1: ");

        for (int i = 5; i > 0; i--) {

            if (i > 1) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i + ".");
            }
        }
    }

//    3. Напишите программу, где пользователь вводит любое целое
//    положительное число. А программа суммирует все числа от 1 до
//    введенного пользователем числа.
//    Для ввода числа воспользуйтесь классом Scanner.

    public static void getSum() {

        System.out.print("Enter the number: ");
        int result = 0;
        int num = getData();
        for (int i = num; i > 0; i--) {
            result += i;
        }

        System.out.println("The sum of the numbers from 1 to " + num + ": " + result);
    }

//    4. Необходимо, чтоб программа выводила на экран вот такую
//    последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//    В решении используйте цикл while.

    public static void getStringOfNum() {

        System.out.print("Sequence: ");

        int result = 0;
        while (result < 97) {
            result += 7;
            if (result < 92) {
                System.out.print(result + " ");
            } else {
                System.out.println(result + ".");
            }
        }

    }

//    5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..

    public static void getNumString() {

        System.out.print("How many numbers you want to see: ");
        int numOfCycle = getData();

        System.out.print("Enter the step: ");
        int step = getData();

        int counter = 0;
        int result = 0;

        System.out.print("Sequence: ");

        do {
            if (counter < numOfCycle - 1) {
                System.out.print(result + ", ");
            } else {
                System.out.println(result + ".");
            }

            result += step;
            counter++;

        }

        while (counter < numOfCycle);

    }

//    6. Составьте программу, выводящую на экран квадраты чисел от 10 до
//    20 включительно.

    public static void getSquare() {

        System.out.print("Quares of numbers from 10 to 20 inclusive:");

        for (int i = 10; i < 21; i++) {
            System.out.print(" " + (int) Math.pow(i, 2));
        }

        System.out.println();
    }

//    1. Выведите на экран первые 11 членов последовательности Фибоначчи.

    public static void getFibonacci() {

        int firstNum = 0;
        int secondNum = 1;
        int nextNum;

        System.out.print("Fibonacci:");

        for (int i = 0; i < 12; i++) {
            System.out.print(" " + firstNum);
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

        System.out.println();
    }

//    2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//    Напишите программу, в которую пользователь вводит сумму вклада и
//    количество месяцев. А банк вычисляет конечную сумму вклада с учетом
//    начисления процентов за каждый месяц.
//    Для вычисления суммы с учетом процентов используйте цикл for. Пусть
//    сумма вклада будет представлять тип float.

    public static void getInvestment() {

        System.out.print("Deposit amount: ");
        int deposit = getData();

        System.out.print("Deposit term in months: ");
        int month = getData();

        System.out.print("Percent rate, % per month: ");
        float percent = getData() / 100F;

        float amount = 0;
        if (month < 1 || deposit < 1 || (percent * 100) < 1) {
            System.out.println("The data was entered incorrectly! Try again.");
            getInvestment();
        } else {
            for (int i = month; i >= 0; i--) {
                amount = deposit + (deposit * percent);
            }
            System.out.println("The amount at the end of the term: " + amount);
        }

    }

//    3. Напишите программу, которая выводит на консоль таблицу
//    умножения.

    public static void getMultiTable() {

        System.out.print("---------------------------------------MultiTable---------------------------------------");

        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 1; j < 11; j++) {
                int result = i * j;
                System.out.print(j + "x" + i + "=" + result + " ");
                if (result < 10) {
                    System.out.print("   ");
                } else if (i == 10) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }

        }
    }

}
