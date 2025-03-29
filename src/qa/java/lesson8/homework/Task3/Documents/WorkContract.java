package qa.java.lesson8.homework.Task3.Documents;

import java.time.LocalDate;

public class WorkContract extends Document {

    private final LocalDate endContract;
    private final String name;

    public WorkContract(int docNumber, int year, int month, int day, int endYear, int endMonth, int endDay, String name) {
        super(docNumber, year, month, day);
        this.endContract = LocalDate.of(endYear, endMonth, endDay);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Work Contract\n" +
                "\tDocument number: " + super.getDocNumber() + "\n" +
                "\tDocument date: " + super.getDate() + "\n" +
                "\tEnd date of the contract: " + endContract + "\n" +
                "\tEmployee's name: " + name + "\n";
    }

}
