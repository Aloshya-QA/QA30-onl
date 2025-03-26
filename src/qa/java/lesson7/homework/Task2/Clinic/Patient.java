package qa.java.lesson7.homework.Task2.Clinic;

import java.util.Random;

public class Patient {
    private final String name;
    private final TreatmentPlan treatmentPlan;

    public Patient(String name) {
        this.name = name;
        this.treatmentPlan = new TreatmentPlan(rangeRandom());
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    private static int rangeRandom() {

        int start = 1;
        int end = 3;

        return new Random().nextInt((end - start) + 1) + start;
    }

    public String getName() {
        return name;
    }
}
