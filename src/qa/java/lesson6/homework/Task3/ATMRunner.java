package qa.java.lesson6.homework.Task3;

public class ATMRunner {
    public static void main(String[] args) {
        ATM MTBank = new ATM(15, 13, 16);

        MTBank.getBalance();
        MTBank.addMoney();
        MTBank.getBalance();
        MTBank.addTotalMoney();
        MTBank.getBalance();
        MTBank.takeOutMoney();
        MTBank.getBalance();
    }
}
