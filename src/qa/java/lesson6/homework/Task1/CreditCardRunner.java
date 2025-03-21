package qa.java.lesson6.homework.Task1;

public class CreditCardRunner {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard(1111_1111_1111_1111L, 10000);
        CreditCard secondCard = new CreditCard(1111_2222_1111_1111L, 13000);
        CreditCard thirdCard = new CreditCard(1111_2222_1111_1111L, 0);

        getInfo(firstCard, secondCard, thirdCard);
        depositMoney(firstCard, secondCard);
        withdrawMoney(thirdCard);
        getInfo(firstCard, secondCard, thirdCard);
    }

    public static void getInfo(CreditCard... cards) {
        for (CreditCard card : cards) {
            card.cardInfo();
        }
        System.out.println();
    }

    public static void depositMoney(CreditCard... cards) {
        for (CreditCard card : cards) {
            card.depositMoney(7777);

        }
        System.out.println();
    }

    public static void withdrawMoney(CreditCard... cards) {
        for (CreditCard card : cards) {
            card.withdrawM0ney(3333);

        }
        System.out.println();
    }
}
