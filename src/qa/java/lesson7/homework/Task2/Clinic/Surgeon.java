package qa.java.lesson7.homework.Task2.Clinic;

public class Surgeon extends Doctor {
    @Override
    public void healing(String name) {
        System.out.println("The surgeon performed an operation on a patient named " + name);
    }
}
