package qa.java.lesson8.homework.Task3;

import qa.java.lesson8.homework.Task3.Documents.Contract;
import qa.java.lesson8.homework.Task3.Documents.Document;
import qa.java.lesson8.homework.Task3.Documents.Invoice;
import qa.java.lesson8.homework.Task3.Documents.WorkContract;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        Document invoice = new Invoice(14235,
                2025, 4, 12,
                324, 10400
        );
        Document workContract = new WorkContract(
                24356, 2020, 6, 15,
                2025, 6, 15, "Maxim"
        );
        Document contract = new Contract(
                23456, 2023, 4, 14,
                100, "Pen"
        );

        register.getInfo(invoice, workContract, contract);
        register.saveDocument(invoice, workContract, contract);
//        register.printArray();

    }
}
