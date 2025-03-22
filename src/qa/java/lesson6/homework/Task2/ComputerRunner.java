package qa.java.lesson6.homework.Task2;

public class ComputerRunner {

    public static void main(String[] args) {
        Computer hp = new Computer("HP", 2000);
        Computer asus = new Computer("ASUS", 1800);
        Computer gigabyte = new Computer("GIGABYTE", 2100,
                new Ssd(512, "Samsung", "Internal"),
                new Ram(16, "Samsung"));

        getInfo(hp, asus, gigabyte);

    }

    public static void getInfo(Computer... computers) {
        for (Computer computer : computers) {
            computer.getInfo();
        }
    }


}
