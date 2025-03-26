package qa.java.lesson7.homework.Task2;

import qa.java.lesson7.homework.Task2.Clinic.Clinic;
import qa.java.lesson7.homework.Task2.Clinic.Patient;

public class ClinicRunner {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Patient patient = new Patient("Maxim");
        Patient patient1 = new Patient("David");
        Patient patient2 = new Patient("Zoe");

        clinic.toAppointDoctor(patient1, patient2, patient);

    }

}
