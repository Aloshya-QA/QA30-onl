package qa.java.lesson7.homework.Task1.phones;

import qa.java.lesson7.homework.Task1.Phone;

public class Iphone extends Phone {
    public Iphone(long number, double weight, String model) {
        super(number, weight, model);
    }

    @Override
    public void receiveCall(String name, long number) {
        System.out.println(name + " +" + number + " is calling.");
    }

    @Override
    public void sendMessage(long... numbers) {
        for (long number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
