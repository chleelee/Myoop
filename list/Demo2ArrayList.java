package list;

import java.util.ArrayList;

public class Demo2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(1, "New");
        System.out.println(list);
    }
}
