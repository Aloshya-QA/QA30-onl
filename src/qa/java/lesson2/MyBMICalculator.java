package qa.java.lesson2;

import java.util.Scanner;

public class MyBMICalculator {
    public static void main(String[] args) {
        introduceBMICalculator();
    }

    public static void introduceBMICalculator(){
        System.out.println("Welcome to BMI calculator. It counts proportion of your height and weight.");
        System.out.println("You will be able to enter a value of your height in cm, your weight in kg.");
        resultOfCalcData();
    }

    public static int getHeight(){
        System.out.print("Please, enter your height in cm: ");

        return inputData().nextInt();
    }

    public static double getWeight() {
        System.out.print("Please, enter your weight in kg: ");

        return inputData().nextDouble();
    }

    public static double convertToMeters(int height) {
        return (double) height / 100;
    }

    public static Scanner inputData(){
        return new Scanner(System.in);
    }

    public static double calcData(){
        double height = convertToMeters(getHeight());
        double massIndex = getWeight() / Math.pow(height, 2);
        System.out.println("Your mass index: " + massIndex);
        return massIndex;
    }

    public static void resultOfCalcData() {
        double massIndex = calcData();
        boolean normalMassIndex = 18.5 < massIndex & massIndex < 24.99;
        if (normalMassIndex) {
            System.out.println("Your body is fine");
        } else if (massIndex <= 18.5) {
            System.out.println("Underweight");
        } else {
            System.out.println("Overweight");
        }
    }
}
