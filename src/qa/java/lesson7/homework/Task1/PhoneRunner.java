package qa.java.lesson7.homework.Task1;

import qa.java.lesson7.homework.Task1.phones.Iphone;
import qa.java.lesson7.homework.Task1.phones.Pixel;
import qa.java.lesson7.homework.Task1.phones.Samsung;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone samsung = new Samsung(375298889898L, 0.2, "Samsung S24");
        Phone iphone = new Iphone(375336645867L, 0.19, "iPhone 16 Pro");
        Phone pixel = new Pixel(375298887676L, 0.18, "Pixel 9");

        getInfo(samsung, iphone, pixel);
    }

    public static void getInfo(Phone... phones) {
        for (Phone phone : phones) {
            System.out.println(phone);
            phone.receiveCall("Maxim", 375336453423L);
            phone.sendMessage(375336453423L, 375298887676L, 375336645867L);
        }

    }
}
