package qa.java.lesson8.homework.Task3.Documents;

public class Invoice extends Document {

    private final int code;
    private final long sum;

    public Invoice(int docNumber, int year, int month, int day, int code, long sum) {
        super(docNumber, year, month, day);
        this.code = code;
        this.sum = sum;
    }


    @Override
    public String toString() {
        return "Invoice\n" +
                "\tFinal sum: " + sum + "$\n" +
                "\tDocument date: " + super.getDate() + "\n" +
                "\tDocument number: " + super.getDocNumber() + "\n" +
                "\tDepartment code: " + code + "\n";
    }
}
