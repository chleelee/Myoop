package list;

import java.util.ArrayList;

public class Demo3ArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("789");
        list.add("789");
        list.add("xyz");
        String s1 = list.get(0);
        System.out.println(s1);
        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < list.size(); i++) {
            if ("789".equals(list.get(i))) {
                list.remove(i);
                i--;
        System.out.println(list);
            }
        }        
        
    }

    public static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("xyz");
        list.set(0, "new");
        System.out.println(list);
    }

    public static void tsetRemover() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("xyz");
        list.remove("abc");
        System.out.println(list);
    }
}