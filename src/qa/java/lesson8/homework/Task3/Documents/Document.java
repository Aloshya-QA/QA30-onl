package qa.java.lesson8.homework.Task3.Documents;

import java.time.LocalDate;

public abstract class Document {
    private final String docNumber;
    private final LocalDate date;

    public Document(String docNumber, int year, int month, int day) {
        this.docNumber = docNumber;
        this.date = LocalDate.of(year, month, day);

    }

    public String getDocNumber() {
        return docNumber;
    }

    public LocalDate getDate() {
        return date;
    }

}
