package object;

public class Car {
    private String brand;
    private String color;
    private double flow;

    public Car() {
    }

    public Car(String brand, String color, double flow) {
        this.brand = brand;
        this.color = color;
        this.flow = flow;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFlow() {
        return this.flow;
    }

    public void setFlow(double flow) {
        this.flow = flow;
    }
    public void show() {
        System.out.println(brand + " " + color + " 排量" + flow + "升");
    }

}
