package qa.java.lesson6.homework.Task2;

public class Ssd {
    private int volume;
    private String name;
    private String type;

    public Ssd() {
    }

    public Ssd(int volume, String name, String type) {
        this.volume = volume;
        this.name = name;
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String isType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
