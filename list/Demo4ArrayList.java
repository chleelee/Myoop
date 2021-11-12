package list;

import java.util.ArrayList;

import domain.stu;
//创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
public class Demo4ArrayList {

    public static void main(String[] args) {
        //创建集合对象
        ArrayList<stu> list = new ArrayList<>();
        ArrayList<stu> NewList = new ArrayList<>();
        //创建学生对象
        stu student1 = new stu("Tom", 21);
        stu student2 = new stu("Chenxi", 20);
        stu student3 = new stu("Chris", 23);
        stu student4 = new stu("ChenXie", 18);
        stu student5 = new stu("JiaJia", 13);
        //添加学生对象到集合中
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        //遍历集合，采用通用遍历格式实现
        for (int i = 0; i < list.size(); i++) {
            stu student = list.get(i);
            //System.out.println(student.getName()+"..."+student.getAge());
            if (student.getAge() <= 20) {
                stu NewStudent = list.get(i);
                System.out.println(NewStudent.getName()+"..."+NewStudent.getAge());
                NewList.add(NewStudent);
            
            


                
            }
        
        
        }System.out.println(NewList);
        

        
    }
}
