package qa.java.lesson8.homework.Task3.Documents;

import java.time.LocalDate;

public abstract class Document {
    private final int docNumber;
    private final LocalDate date;

    public Document(int docNumber, int year, int month, int day) {
        this.docNumber = docNumber;
        this.date = LocalDate.of(year, month, day);

    }

    public int getDocNumber() {
        return docNumber;
    }

    public LocalDate getDate() {
        return date;
    }

}
