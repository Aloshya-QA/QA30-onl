package qa.java.lesson8.homework.Task3;

import qa.java.lesson8.homework.Task3.Documents.Contract;
import qa.java.lesson8.homework.Task3.Documents.Document;
import qa.java.lesson8.homework.Task3.Documents.Invoice;
import qa.java.lesson8.homework.Task3.Documents.WorkContract;
import qa.java.lesson8.homework.Task3.Exceptions.DocumentValidator;
import qa.java.lesson8.homework.Task3.Exceptions.InvalidSequenceException;

public class Main {
    public static void main(String[] args) throws InvalidSequenceException {

        Register register = new Register();

        Document invoice = new Invoice("5524ac3561a2b",
                2025, 4, 12,
                324, 10400
        );
        Document workContract = new WorkContract(
                "55524abc3561a2b", 2020, 6, 15,
                2025, 6, 15, "Maxim"
        );
        Document contract = new Contract(
                "55524ab3561ab", 2023, 4, 14,
                100, "Pen"
        );

        DocumentValidator docValidator = new DocumentValidator(invoice, workContract, contract);

        docValidator.validator();

        register.getInfo(invoice, workContract, contract);
        register.saveDocument(invoice, workContract, contract);

        docValidator.validator();

//        register.printArray();


    }
}
