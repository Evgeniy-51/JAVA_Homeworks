public class Laptop {
    private String model;
    private double screenSize;
    private String color;
    private String cpu;
    private int ram;
    private int hdd;
    private int price;

    public Laptop(String model, double screenSize, String color, String cpu, int ram, int hdd, int price) {
        this.model = model;
        this.screenSize = screenSize;
        this.color = color;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getPrice() {
        return price;
    }
}
