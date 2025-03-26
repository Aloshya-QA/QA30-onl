package qa.java.lesson7.homework.Task2.Clinic;

public class Clinic {
    private final Doctor internist;
    private final Doctor dentist;
    private final Doctor surgeon;

    public Clinic() {
        this.dentist = new Dentist();
        this.internist = new Internist();
        this.surgeon = new Surgeon();
    }

    public void toAppointDoctor(Patient... patients) {

        for (Patient patient : patients) {
            if (patient.getTreatmentPlan().getCode() == 1) {
                surgeon.healing(patient.getName());
            } else if (patient.getTreatmentPlan().getCode() == 2) {
                dentist.healing(patient.getName());
            } else {
                internist.healing(patient.getName());
            }
        }

    }
}
