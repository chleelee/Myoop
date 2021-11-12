import domain.stu;

public class student {
    public static void main(String[] args) {
        stu[] arr = new stu[3]; //动态初始化长度为3的数组，类型为stu，用快速fix导包domain
        stu s1 = new stu("Chenxi", 21); //创建三个学生对象s1
        stu s2 = new stu("LinLin", 23);
        stu s3 = new stu("XiaoMing", 24);
        arr[0] = s1;           //将学生对象存入数组
        arr[1] = s2;
        arr[2] = s3;
        for (int i = 0; i < arr.length; i++) {   //遍历数组，取出每一个学生对象
        //    System.out.println(arr[i]);       //三个学生对象的内存地址
            stu temp = arr[i]; //用临时变量（stu类型）temp接受对象
            System.out.println(temp.getName() + ".." + temp.getAge());
        }
        





    }
}
