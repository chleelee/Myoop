package object;

public class testStar {

    public static void main(String[] args) {
    
    
    Star Si = new Star(); 
    Si.setName("梅兰芳");
    Si.setAge(78);
    int age = Si.getAge();//得到数据，进行后续操作
    for (int i = 0; i < age; i++) {
        System.out.println("生日快乐");
    }

    Si.show();//仅仅对数据做展示
}
}
