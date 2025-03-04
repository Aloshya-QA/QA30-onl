package qa.java.lesson2;

import java.util.Scanner;

public class MyBMICalculator {
    public static void main(String[] args) {

    }

    public static void introduceBMICalculator(){
        System.out.println("Welcome to BMI calculator. It counts proportion of your height and weight.");
        System.out.println("You will be able to enter a value of your height in cm, your weight in kg.");
    }

    public static void getData(){
        System.out.print("Please, enter your height in cm: ");
        int height = inputData().nextInt();
        System.out.print("Please, enter your weight in kg: ");
        double weight = inputData().nextDouble();
    }

    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}
