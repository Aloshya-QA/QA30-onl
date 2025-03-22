package qa.java.lesson6.homework.Task3;

import java.util.Scanner;

public class ATM {
    private final int BANKNOTE_TYPE_ONE = 20;
    private final int BANKNOTE_TYPE_TWO = 50;
    private final int BANKNOTE_TYPE_THREE = 100;

    private int countOfTypeOne;
    private int countOfTypeTwo;
    private int countOfTypeThree;

    private long balance;

    public ATM(int twentyBill, int fiftyBill, int hundredBill) {
        this.countOfTypeOne = twentyBill;
        this.countOfTypeTwo = fiftyBill;
        this.countOfTypeThree = hundredBill;

        addMoney(countOfTypeOne, countOfTypeTwo, countOfTypeThree);
    }

    private void addMoney(int twenty, int fifty, int hundred) {
        this.balance += (BANKNOTE_TYPE_ONE * twenty) +
                (BANKNOTE_TYPE_TWO * fifty) +
                (BANKNOTE_TYPE_THREE * hundred);
    }

    private void addCountOfMoneyType(int countOfTypeOne, int countOfTypeTwo, int countOfTypeThree) {
        this.countOfTypeOne += countOfTypeOne;
        this.countOfTypeTwo += countOfTypeTwo;
        this.countOfTypeThree += countOfTypeThree;
    }

    private void addCountOfMoneyType(int money) {
        countOfTypeThree += money / BANKNOTE_TYPE_THREE;
        countOfTypeTwo += (money / BANKNOTE_TYPE_THREE) / BANKNOTE_TYPE_TWO;
        countOfTypeOne += ((money / BANKNOTE_TYPE_THREE) / BANKNOTE_TYPE_TWO) % BANKNOTE_TYPE_ONE;
    }

    private void takeOutMoney(int money) {
        countOfTypeThree -= money / BANKNOTE_TYPE_THREE;
        countOfTypeTwo -= (money / BANKNOTE_TYPE_THREE) / BANKNOTE_TYPE_TWO;
        countOfTypeOne -= ((money / BANKNOTE_TYPE_THREE) / BANKNOTE_TYPE_TWO) % BANKNOTE_TYPE_ONE;
    }

    void addMoney() {

        System.out.println("***** Add Money *****");

        System.out.print("Enter the number of $20 bills: ");
        int twenty = new Scanner(System.in).nextInt();

        System.out.print("Enter the number of $50 bills: ");
        int fifty = new Scanner(System.in).nextInt();

        System.out.print("Enter the number of $100 bills: ");
        int hundred = new Scanner(System.in).nextInt();


        addMoney(twenty, fifty, hundred);
        addCountOfMoneyType(twenty, fifty, hundred);
    }

    void addTotalMoney() {

        System.out.print("Enter the sum to be deposited: ");
        int money = new Scanner(System.in).nextInt();

        if (money > 0) {
            if ((((money % BANKNOTE_TYPE_THREE) % BANKNOTE_TYPE_TWO) % BANKNOTE_TYPE_ONE) == 0) {
                this.balance += money;
                addCountOfMoneyType(money);

            } else {
                System.out.println("The ATM accepts banknotes in denominations of 20, 50, 100 $. Please try again.");
                addTotalMoney();

            }
        } else {
            System.out.println("Incorrect amount. Please try again.");
            addTotalMoney();
        }

    }

    private boolean isEnoughMoney(int money) {

        if (money > 0) {
            if (this.balance > money) {
                if ((((money % BANKNOTE_TYPE_THREE) % BANKNOTE_TYPE_TWO) % BANKNOTE_TYPE_ONE) == 0) {
                    return true;
                } else {
                    System.out.println("The ATM issues banknotes in denominations of 20, 50, 100 dollars. Please try again.");
                    return false;
                }
            } else {
                System.out.println("Not enough money. Please try again.");
                return false;
            }
        } else {
            System.out.println("Incorrect amount. Please try again.");
            return false;
        }

    }

    void takeOutMoney() {
        System.out.print("Enter the amount to be withdrawn: ");
        int money = new Scanner(System.in).nextInt();

        if (isEnoughMoney(money)) {
            this.balance -= money;
            takeOutMoney(money);
            numberOfBills(money);
            System.out.println("Total withdrawal money: " + money + "$");

        } else takeOutMoney();
    }

    void getBalance() {
        System.out.println("The total amount of money in the ATM: " + balance + "$");
    }

    void numberOfBills(int money) {
        int hundred = money / BANKNOTE_TYPE_THREE;
        int fifty = (money % BANKNOTE_TYPE_THREE) / BANKNOTE_TYPE_TWO;
        int twenty = ((money % BANKNOTE_TYPE_THREE) % BANKNOTE_TYPE_TWO) / BANKNOTE_TYPE_ONE;

        System.out.println("Withdraw money: ");

        if (hundred > 0) {
            System.out.println(hundred + " x " + BANKNOTE_TYPE_THREE + "$");

        }
        if (fifty > 0) {
            System.out.println(fifty + " x " + BANKNOTE_TYPE_TWO + "$");

        }
        if (twenty > 0) {
            System.out.println(twenty + " x " + BANKNOTE_TYPE_ONE + "$");
        }
    }
}
