package object;

public class Star {
    private String name;
    private int age;
    public void setName(String N) {
        name = N;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
    public void show() {
        System.out.println("演员是" + name + "，年龄是" + age);
    }

}
