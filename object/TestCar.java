package object;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("奥迪");
        car1.setColor("银色");
        car1.setFlow(4.2);
        Car car2 = new Car();
        car2.setBrand("奔驰");
        car2.setColor("黑色");
        car2.setFlow(3.5);
        car1.show();
        car2.show();
    }
}
