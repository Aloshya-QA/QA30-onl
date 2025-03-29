package qa.java.lesson8.homework.Task3;

import qa.java.lesson8.homework.Task3.Documents.Document;


public class Register {

    private final Document[] docDatabase = new Document[10];

    void saveDocument(Document... documents) {
        for (Document document : documents) {
            for (int i = 0; i < documents.length; i++) {
                if (this.docDatabase[i] == null) {
                    this.docDatabase[i] = document;
                    break;
                }
            }
        }
    }


    void printArray() {
        for (Document doc : this.docDatabase) {
            if (doc != null) {
                System.out.println(doc);
            }
        }
    }

    void getInfo(Document... documents) {
        for (Document document : documents) {
            System.out.println(document);
        }
    }
}
