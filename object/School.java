package object;

public class School {
    private String name;
    private int age;

    public School() {
    }

    public School(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }



	public void show() {
        System.out.println(name + " " + age);
    }
}
