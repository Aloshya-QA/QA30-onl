package qa.java.lesson6.homework.Task1;

public class CreditCard {
    private long cardBill;
    private int cardFunds;

    public CreditCard(long cardBill, int cardFunds) {
        this.cardBill = cardBill;
        this.cardFunds = cardFunds;
    }

    public void cardInfo() {
        System.out.println("Card bill: " + this.cardBill);
        System.out.println("Account balance: " + this.cardFunds);
        System.out.println();
    }

    public void depositMoney(int money) {
        this.cardFunds += money;
        System.out.println("Credited funds: " + money);
    }

    public void withdrawM0ney(int money) {
        if (this.cardFunds < money) {
            System.out.println("Not enough money on balance");
        } else {
            this.cardFunds -= money;
            System.out.println("Withdrawal of funds: " + money);
        }
    }
}
