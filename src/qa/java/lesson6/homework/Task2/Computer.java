package qa.java.lesson6.homework.Task2;

public class Computer {
    private String model;
    private int cost;
    private Ssd ssd;
    private Ram ram;

    public Computer(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public Computer(String model, int cost, Ssd ssd, Ram ram) {
        this.model = model;
        this.cost = cost;
        this.ssd = ssd;
        this.ram = ram;
    }

    public void getInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Cost: " + this.cost + "$");
        System.out.println("SSD: " + this.ssd.getName() + ", " + this.ssd.getVolume() + ";");
        System.out.println("RAM: " + this.ram.getName() + ", " + this.ram.getVolume() + ";");

    }
}
