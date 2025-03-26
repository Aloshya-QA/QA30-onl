package qa.java.lesson7.homework.Task1;

public abstract class Phone {
    private long number;
    private double weight;
    private String model;
    private static int counter;


    public Phone(long number, double weight, String model) {
        this(number, model);
        this.number = number;
        this.weight = weight;
        this.model = model;

    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public abstract void sendMessage(long... numbers);

    @Override
    public String toString() {
        return "Phone " + counter++ + ":" +
                "\n\tNumber: " + number +
                ";\n\tWeight: " + weight + "kg" +
                ";\n\tModel: " + model + "\n";
    }

    public long getNumber() {
        return number;
    }

    public abstract void receiveCall(String name, long number);
}
