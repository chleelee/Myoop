package object;

public class student {
    private String name;

    private int age;
    /*private：私有的
    private是一个权限修饰符，用来修饰符成员（变量、方法）
    特点：只能在本类当中进行访问
    */
    //设置值
    public void setAge(int a) {
        if (a > 0 && a <= 120) {
            age = a;
        } else {
            System.out.println("你的年龄不合理");
        }
    }
    //获取值
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void study() {
        System.out.println("学习");
    }
    public void show() {
        System.out.println(name + "..." + age);
    }
}
