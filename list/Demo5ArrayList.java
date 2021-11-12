package list;

import java.util.ArrayList;
import java.util.Scanner;

import domain.stu;

public class Demo5ArrayList {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<stu> list = new ArrayList<>();
        

        stu student1 = getStudent();
        stu student2 = getStudent();
        stu student3 = getStudent();
        
        //往集合中添加学生对象
        list.add(student1);
        list.add(student2);
        list.add(student3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            stu student = list.get(i);
            System.out.println(student.getName()+"..."+ student.getAge());
        }
    }

    private static stu getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        stu student = new stu(name, age);
        return student;
    }
}
