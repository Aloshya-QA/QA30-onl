package qa.java.lesson7.homework.Task2.Clinic;

public class Internist extends Doctor {

    @Override
    public void healing(String name) {
        System.out.println("The therapist diagnosed a patient named " + name);
    }
}
