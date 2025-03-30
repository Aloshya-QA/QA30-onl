package qa.java.lesson8.homework.Task3.Documents;

public class Contract extends Document {

    private final int amountOfGoods;
    private final String type;

    public Contract(String docNumber, int year, int month, int day, int amountOfGoods, String type) {
        super(docNumber, year, month, day);
        this.amountOfGoods = amountOfGoods;
        this.type = type;
    }


    @Override
    public String toString() {
        return "Contract for the supply of goods\n" +
                "\tDocument number: " + super.getDocNumber() + "\n" +
                "\tType of goods: " + type + "\n" +
                "\tAmount of goods: " + amountOfGoods + "\n" +
                "\tDocument date: " + super.getDate() + "\n";
    }
}
