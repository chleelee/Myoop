package object;

public class mobile {
    String brand;
    int price;
    public void call(String name) {
        System.out.println("给"+name+ "打电话");
    }
    public void message() {
        System.out.println("群发短信");
    }

}
