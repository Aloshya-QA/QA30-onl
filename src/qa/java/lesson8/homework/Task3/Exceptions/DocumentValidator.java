package qa.java.lesson8.homework.Task3.Exceptions;

import qa.java.lesson8.homework.Task3.Documents.Document;

public class DocumentValidator {

    private final Document[] documents;
    private static int COUNTER = 1;

    public DocumentValidator(Document... document) {
        this.documents = document;
    }

    public void checkContains() throws InvalidSequenceException {
        for (Document document : this.documents) {
            if (!document.getDocNumber().contains("abc")) {
                throw new InvalidSequenceException("Error: The document number does not contain 'abc'");
            }
        }
    }

    public void checkStarts() throws InvalidSequenceException {
        for (Document document : this.documents) {
            if (!document.getDocNumber().startsWith("555")) {
                throw new InvalidSequenceException("Error: The document number does not start with '555'");
            }
        }
    }

    public void checkEnds() throws InvalidSequenceException {
        for (Document document : this.documents) {
            if (!document.getDocNumber().endsWith("1a2b")) {
                throw new InvalidSequenceException("Error: The document number does not end with '1a2b'");
            }

        }
    }

    private void validate() {
        try {
            checkStarts();
            System.out.println("\tThe document number starts with '555'");

        } catch (InvalidSequenceException e) {
            System.out.println(e.getMessage());

        }

        try {
            checkContains();
            System.out.println("\tThe document number contains 'abc'");

        } catch (InvalidSequenceException e) {
            System.out.println(e.getMessage());

        }

        try {
            checkEnds();
            System.out.println("\tThe document number ends with '1a2b'");

        } catch (InvalidSequenceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
    }

    public void validator() {
        for (Document document : documents) {
            DocumentValidator validator = new DocumentValidator(document);
            System.out.println("Document №" + COUNTER);
            validator.validate();
            COUNTER++;

        }
    }

}
