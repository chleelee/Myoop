package list;

import java.util.ArrayList;

public class Demo1ArrayList {
    public static void main(String[] args) {
        //创建集合容器对象
        ArrayList list = new ArrayList<>();
        //调用对象的add方法，向容器中添加数据
        list.add("abc");
        list.add(123);
        list.add(true);
        System.out.println(list);

    }
}
