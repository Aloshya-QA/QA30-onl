package qa.java.lesson7.homework.Task2.Clinic;

public class Dentist extends Doctor {

    @Override
    public void healing(String name) {
        System.out.println("The dentist treated the tooth of a patient named " + name);
    }
}
