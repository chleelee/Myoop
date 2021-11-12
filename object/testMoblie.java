package object;

public class testMoblie {
    public static void main(String[] args) {
        //1.创建对象
        mobile p = new mobile();
        //2.给成员变量（brand，price）进行赋值
        p.brand = "SAMMUNG";
        p.price = 4899;
        //3.打印赋值后的成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        //4.调用成员方法
        p.call("李辰熙");
        p.message();
        mobile q = new mobile();
        q.brand = "APPLE";
        q.price = 7899;
        System.out.println(q.brand + " " + q.price);
        q.call("谢澄");

    }
}
